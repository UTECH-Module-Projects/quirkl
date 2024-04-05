package com.apl.quirkl.controller;

import com.apl.quirkl.language.lexer.QuirklLexer;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.value.QuirklErrValue;
import com.apl.quirkl.language.semantics.visitor.QuirklErrorListener;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToProg;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.io.*;
import java.util.concurrent.Callable;

public class QuirklCompiler implements Callable<Integer> {
    @Option(names = {"-f", "--file"}, description = "Quirkl file to compile")
    private String file;

    @Option(names = {"-d", "--debug"}, defaultValue = "true", description = "Enable debug mode")
    private boolean debug;

    public static void main(String[] args) {
        System.out.println("return " + new CommandLine(new QuirklCompiler()).execute(args));
    }

    @Override
    public Integer call() throws Exception {
        StringBuilder str = new StringBuilder();
        if (file != null) {
            try (var reader = new FileReader(file)) {
                str.append(String.join("\n", new BufferedReader(reader).lines().toList()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String line;
                while ((line = reader.readLine()) != null)
                    str.append(line);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(str.toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new QuirklErrorListener());

        AntlrToProg visitor = new AntlrToProg();
        Prog prog = visitor.visitProgram(parser.program());

        if (QuirklErrorListener.hasError)
            return -1;

        if (prog.hasError()) {
            System.err.println(new QuirklErrValue(prog.getErrors().getFirst()));
            prog.getErrors().getFirst().printStackTrace();
            prog.printState();
            return -1;
        }

        try {
            prog.eval();
            prog.printState();
        } catch (QuirklRuntimeException e) {
            System.err.println(new QuirklErrValue(e));
            prog.printState();
            if (debug)
                prog.printState();
            return -1;
        }
        return 0;
    }
}