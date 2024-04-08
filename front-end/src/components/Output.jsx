import {useState} from "react";
import {Box, Button, Text, useToast, Tab, Tabs, TabList, TabPanel, TabPanels} from "@chakra-ui/react";
import TerminalComponent from './Terminal.jsx';

const Output = () => {
    const toast = useToast();
    const [output, setOutput] = useState(null);
    const [isLoading, setIsLoading] = useState(false);
    const [isError, setIsError] = useState(false);

    return (
        <Box w="100%" h="100%" overflow="auto">
            <Text mb={2} fontSize="lg">
                Output
            </Text>
            <Button
                variant="outline"
                colorScheme="green"
                mb={4}
                isLoading={isLoading}
            >
                Run Code
            </Button>
            <Tabs isFitted variant="enclosed">
                <TabList mb="1em">
                    <Tab>Output</Tab>
                    <Tab>Terminal</Tab>
                </TabList>
                <TabPanels>
                    <TabPanel>
                        <Box
                            height="100%"
                            p={2}
                            color={isError ? "red.400" : ""}
                            border="1px solid"
                            borderRadius={4}
                            borderColor={isError ? "red.500" : "#333"}
                            overflow="auto"
                        >
                            {output
                                ? output.map((line, i) => <Text key={i}>{line}</Text>)
                                : 'Click "Run Code" to see the output here'}
                        </Box>
                    </TabPanel>
                    <TabPanel>
                        <TerminalComponent
                            setOutput={setOutput}
                            setIsLoading={setIsLoading}
                            setIsError={setIsError}
                            toast={toast}
                        />
                    </TabPanel>
                </TabPanels>
            </Tabs>
        </Box>
    );
};

export default Output;