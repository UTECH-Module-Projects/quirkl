import { useRef, useState } from "react";
import { Box, Flex } from "@chakra-ui/react"; // Import Box and Flex
import QuirklEditor from './QuirklLanguage.jsx';
import Output from "./Output.jsx";

const CodeEditor = () => {
    const editorRef = useRef(null);
    const [, setValue] = useState("");

    const onMount = (editor) => {
        editorRef.current = editor;
        editor.focus();
    };

    return (
        <Flex w="100%" h="100vh">
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
                    height="100%"
                    theme="vs-dark"
                />
            </Box>
            <Box flex="1" w="100%" h="100%">
                <Output editorRef={editorRef} />
            </Box>
        </Flex>
    );
};

export default CodeEditor;