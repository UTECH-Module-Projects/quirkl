import ChatBot from 'react-simple-chatbot';

const chatbot_config = {
    floating: true
};

// eslint-disable-next-line no-unused-vars
const handleUserInput = async (value) => {
    try {
        // Pass the user input to your custom language compiler or interpreter
        const response = await fetch('https://quirkl.azurewebsites.net/run', {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ program: value }),
        });
        const data = await response.json();
        return data.output;
    } catch (error) {
        return 'An error occurred while processing your request.';
    }
};

const customSteps = [
    {
        id: '0',
        message: 'Welcome to Quirkl Chatbot!',
        trigger: '1'
    },
    {
        id: '1',
        message: 'Tell me a prompt so I can write a program for you in Quirkl.',
        trigger: '2'
    },
    {
        id: '2',
        user: true,
        validator: (value) => {
            if (!value) {
                return 'Please provide a prompt.';
            }
            return true;
        },
        trigger: '3'
    },
    {
        id: '3',
        message: ({ previousValue }) => `Here's the output of your program: \n${previousValue}`,
        trigger: '1'
    },
];

const ChatBotComponent = () => {

    return <ChatBot steps={customSteps} {...chatbot_config} recognitionEnable={true} />;
};

export default ChatBotComponent;