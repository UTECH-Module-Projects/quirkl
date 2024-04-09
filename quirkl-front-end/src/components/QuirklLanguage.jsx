import { useEffect, useRef, useState } from "react";
import {Box} from "@chakra-ui/react";
import { loader } from '@monaco-editor/react';

import * as monaco from 'monaco-editor';
import editorWorker from 'monaco-editor/esm/vs/editor/editor.worker?worker';
import jsonWorker from 'monaco-editor/esm/vs/language/json/json.worker?worker';
import cssWorker from 'monaco-editor/esm/vs/language/css/css.worker?worker';
import htmlWorker from 'monaco-editor/esm/vs/language/html/html.worker?worker';
import tsWorker from 'monaco-editor/esm/vs/language/typescript/ts.worker?worker';
import PropTypes from "prop-types";

self.MonacoEnvironment = {
    getWorker(_, label) {
        if (label === 'json') {
            return new jsonWorker();
        }
        if (label === 'css' || label === 'scss' || label === 'less') {
            return new cssWorker();
        }
        if (label === 'html' || label === 'handlebars' || label === 'razor') {
            return new htmlWorker();
        }
        if (label === 'typescript' || label === 'javascript') {
            return new tsWorker();
        }
        return new editorWorker();
    },
};

loader.config({ monaco });

loader.init().then(/* ... */);

const keywords = [
    'pass',
    'give',
    'run',
    'catch',
    'check',
    'match',
    'to',
    'if',
    'else',
    'is',
    'print',
    'input'
];

const dataTypes = [
    'void',
    'bool',
    'num',
    'dec',
    'str',
    'func'
];

monaco.languages.register({id: 'quirkl'});

monaco.languages.setMonarchTokensProvider('quirkl', {
    keywords: keywords,
    dataTypes: dataTypes,
    ignoreCase: false,
    tokenizer: {
        root: [
            [/@?[a-zA-Z][\w$]*/, {
                cases: {
                    '@keywords': 'keyword',
                    '@dataTypes': 'type',
                    '@default': 'identifier'
                }
            }],
            [/[a-zA-Z][a-zA-Z0-9_]*/, 'identifier'],
            [/-?\d+/, 'number'],
            [/\*--~[\r\n]*/, 'comment'],
            [/\*\*-- .* --\*\*/, 'block_comment'],
            [/".*?"/, 'string']
        ]
    }
});

monaco.editor.defineTheme('quirklTheme', {
    base: 'vs',
    inherit: true,
    rules: [
        {
            token: 'keyword',
            foreground: '569CD6',
            fontStyle: 'bold'
        },
        {
            token: 'type',
            foreground: '4EC9B0',
            fontStyle: 'bold'
        },
        {
            token: 'identifier',
            foreground: 'D4D4D4'
        },
        {
            token: 'number',
            foreground: 'B5CEA8'
        },
        {
            token: 'comment',
            foreground: '6A9955'
        },
        {
            token: 'block_comment',
            foreground: '6A9955'
        },
        {
            token: 'string',
            foreground: 'CE9178'
        },

    ]
});

monaco.languages.registerCompletionItemProvider('quirkl', {
    provideCompletionItems: () => {
        const suggestions = [
            ...keywords.map(keyword => {
                return {
                    label: keyword,
                    kind: monaco.languages.CompletionItemKind.Keyword,
                    insertText: keyword
                }
            })
        ];
        return { suggestions: suggestions };
    }
});

const QuirklEditor = ({ onMount, onChange, options, height, theme }) => {
    const [editorInstance, setEditorInstance] = useState(null);
    const editorRef = useRef(null);

    useEffect(() => {
        if (!editorInstance) {
            const editor = monaco.editor.create(editorRef.current, {
                theme: theme,
                language: 'quirkl',
                options: options,
                value: `a: num = 5;
b: dec = 10;

pass (a: num, b: dec) to add: dec -> a + b;

print(a, " + ", b, " = ", add(a, b));
    `
            });

            setEditorInstance(editor);

            if (onMount) {
                onMount(editor);
            }

            if (onChange) {
                editor.onDidChangeModelContent(() => {
                    onChange(editor.getValue());
                });
            }

            return () => editor.dispose();
        }
    }, []);

    return (
        <div ref={editorRef} style={{height: height, width: "100%"}}/>
    );
}

QuirklEditor.propTypes = {
    onMount: PropTypes.func,
    onChange: PropTypes.func,
    options: PropTypes.object,
    height: PropTypes.string,
    theme: PropTypes.string
};

export default QuirklEditor;


