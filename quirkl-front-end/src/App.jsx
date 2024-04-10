import { Box } from "@chakra-ui/react";
import CodeEditor from "./components/CodeEditor.jsx";

function App() {
    return (
        <Box h="100vh" bg="#0f0a19" color="gray.500" px={6} py={8}>
            <CodeEditor />
        </Box>
    );
}

export default App;