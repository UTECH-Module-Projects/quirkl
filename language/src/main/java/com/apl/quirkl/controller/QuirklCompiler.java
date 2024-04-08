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
import picocli.CommandLine.Parameters;

import java.io.*;
import java.util.concurrent.Callable;

public class QuirklCompiler implements Callable<Integer> {
    @Option(names = {"-d", "--debug"}, description = "Enable debug mode")
    private boolean debug;

    @Parameters(index = "0", description = "The program to run as a string")
    private String program;

    @Parameters(index = "1..*", description = "The user input for the program")
    private String[] input;

    public static BufferedReader reader;

    public static void main(String[] args) {
        System.out.println("return " + new CommandLine(new QuirklCompiler()).execute(args));
    }

    @Override
    public Integer call() {
        if (input == null)
            input = new String[0];

        reader = new BufferedReader(new StringReader(String.join("\n", input)));

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(program));
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
            if (debug) prog.printState();
            return -1;
        }

        try {
            prog.eval();
            if (debug) prog.printState();
            return 0;
        } catch (QuirklRuntimeException e) {
            System.err.println(new QuirklErrValue(e) + "\n");
            if (debug) prog.printState();
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage() + "\n\tcaused by " + e.getCause());
        }
        return -1;
    }
}
