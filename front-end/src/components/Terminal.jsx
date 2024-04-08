import { useEffect, useRef, useCallback } from 'react';
import { Terminal } from 'xterm';
import { FitAddon } from 'xterm-addon-fit';
import 'xterm/css/xterm.css';
import PropTypes from "prop-types";
import { Client } from 'ssh2';

const TerminalComponent = ({ setOutput, setIsLoading, setIsError, toast }) => {
    const terminalRef = useRef(null);

    const runCode = useCallback(async (command) => {
        if (!command) return;
        try {
            setIsLoading(true);
            const conn = new Client();
            conn.on('ready', () => {
                conn.exec(command, (err, stream) => {
                    if (err) throw err;
                    stream.on('close', (code, signal) => {
                        conn.end();
                    }).on('data', (data) => {
                        setOutput([command].concat(data.toString().split("\n")));
                    }).stderr.on('data', (data) => {
                        setIsError(true);
                        toast({
                            title: "An error occurred.",
                            description: data.toString() || "Unable to run code",
                            status: "error",
                            duration: 6000,
                        });
                    });
                });
            }).connect({
                host: 'your-remote-server-ip',
                port: 22,
                username: 'username',
                password: 'password'
            });
        } catch (error) {
            console.log(error);
            toast({
                title: "An error occurred.",
                description: error.message || "Unable to run code",
                status: "error",
                duration: 6000,
            });
        } finally {
            setIsLoading(false);
        }
    }, [setOutput, setIsLoading, setIsError, toast]);

    useEffect(() => {
        const terminal = new Terminal();
        const fitAddon = new FitAddon();
        terminal.loadAddon(fitAddon);
        terminal.open(terminalRef.current);
        fitAddon.fit();

        terminal.onData(data => {
            runCode(data);
            terminal.write(`\r\n$ ${data}`);
        });
    }, [runCode]);

    return <div ref={terminalRef} />;
};

TerminalComponent.propTypes = {
    setOutput: PropTypes.func.isRequired,
    setIsLoading: PropTypes.func.isRequired,
    setIsError: PropTypes.func.isRequired,
    toast: PropTypes.func.isRequired,
};

export default TerminalComponent;