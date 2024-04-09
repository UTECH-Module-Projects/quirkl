import { useRef, useState } from "react";
import { Box, Flex } from "@chakra-ui/react"; // Import Box and Flex
import QuirklEditor from './QuirklLanguage.jsx';
import Interact from "./interact/Interact.jsx";
import ChatBotComponent from "./interact/ChatBotComponent.jsx";

const CodeEditor = () => {
    const editorRef = useRef(null);
    const [, setValue] = useState("");

    const onMount = (editor) => {
        editorRef.current = editor;
        editor.focus();
    };

    return (
        <Flex w="100%" minH="calc(100vh - 5em)">
            <Box flex="1" w="100%" h="100%" mr={6}>
                <QuirklEditor
                    editorRef={editorRef}
                    onMount={onMount}
                    onChange={(value) => setValue(value)}
                    options={{
                        minimap: {
                            enabled: false,
                        },
                    }}
                    height="calc(100vh - 4em)"
                    theme="vs-dark"
                />
            </Box>
            <Box flex="1" h="100%">
                <Interact editorRef={editorRef} />
            </Box>
            <ChatBotComponent />
        </Flex>
    );
};

export default CodeEditor;