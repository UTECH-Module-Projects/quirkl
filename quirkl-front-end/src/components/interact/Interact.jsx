import {useState} from "react";
import {Box, Button, Text, Tab, Tabs, TabList, TabPanel, TabPanels} from "@chakra-ui/react";
import PropTypes from 'prop-types';

import Output from "./Output.jsx";

const Interact = ({ editorRef }) => {
    // eslint-disable-next-line no-unused-vars
    const [output, setOutput] = useState(null);
    const [isLoading, setIsLoading] = useState(false);
    // eslint-disable-next-line no-unused-vars
    const [isError, setIsError] = useState(false);

    const runCode = async () => {
        setIsLoading(true);
        const code = editorRef.current.getValue();

        try {
            const response = await fetch('http://localhost:8080/run', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: code
            });
            const data = await response.json();
            console.log(data.output);
            setOutput(data.output);
        } catch (error) {
            console.log(error);
            setIsError(true);
        } finally {
            setIsLoading(false);
        }
    };

    return (
        <Box w="100%" h="calc(100vh - 4em)">
            <Text mb={2} fontSize="lg">
                Output
            </Text>
            <Button
                variant="outline"
                colorScheme="green"
                mb={4}
                isLoading={isLoading}
                onClick={runCode}
            >
                Run Code
            </Button>
            <Tabs isFitted variant="enclosed" border="1px solid" borderRadius={4} h="calc(100vh - 15em)">
                <TabList>
                    <Tab>Output</Tab>
                    <Tab>Chat</Tab>
                </TabList>
                <TabPanels>
                    <TabPanel>
                        <Output
                            output={output}
                            isError={isError}
                        />
                    </TabPanel>
                </TabPanels>
            </Tabs>
        </Box>
    );
};

Interact.propTypes = {
    editorRef: PropTypes.object.isRequired,
};

export default Interact;