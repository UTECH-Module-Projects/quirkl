import { Box, Text } from "@chakra-ui/react";
import PropTypes from 'prop-types';

const Output = ({ output, isError }) => {
    return (
        <Box
            height="calc(100vh - 20em)"
            p={2}
            color={isError ? "red.400" : ""}
            border="1px solid"
            borderRadius={4}
            borderColor={isError ? "red.500" : "#333"}
            overflow="auto"
        >
            {output
                ? output.split("\n").map((line, i) => <Text key={i}>{line}</Text>)
                : 'Click "Run Code" to see the output here'}
        </Box>
    );
};

Output.propTypes = {
    output: PropTypes.string,
    isError: PropTypes.bool
};

export default Output;