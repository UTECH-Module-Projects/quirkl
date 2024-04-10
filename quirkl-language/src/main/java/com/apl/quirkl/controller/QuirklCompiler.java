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

    @Option(names = {"-f", "--file"}, description = "Run program from file")
    private String path;

    @Option(names = {"-p", "--program"}, description = "The program to run as a string")
    private String program;

    @Parameters(index = "0..*", description = "The user input for the program")
    private String[] input;

    @Option(names = {"-h", "--help"}, usageHelp = true, description = "Display a help message")
    private boolean helpRequested;

    public static BufferedReader reader;

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new QuirklCompiler());
        if (commandLine.isUsageHelpRequested()) {
            commandLine.usage(System.out);
        } else {
            System.out.println("return " + commandLine.execute(args));
        }
    }

    @Override
    public Integer call() {
        String programStr = "";
        if (path != null) {
            if (!path.endsWith(".qkl")) {
                System.err.println("Invalid file type!");
                return -1;
            }

            try {
                programStr = String.join("\n", new BufferedReader(new FileReader(path)).lines().toList());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (program != null) {
            programStr = program;
        } else {
            System.out.println("No program provided!");
            return -1;
        }

        if (input == null)
            input = new String[0];

        reader = new BufferedReader(new StringReader(String.join("\n", input)));

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(programStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new QuirklErrorListener());

        AntlrToProg visitor = new AntlrToProg();
        Prog prog = visitor.visitProgram(parser.program());

        if (QuirklErrorListener.hasError)
            return -1;

        if (prog.hasError()) {
            System.out.println(new QuirklErrValue(prog.getErrors().getFirst()));
            if (debug) prog.printState();
            return -1;
        }

        try {
            prog.eval();
            if (debug) prog.printState();
            return 0;
        } catch (QuirklRuntimeException e) {
            System.out.println(new QuirklErrValue(e));
            if (debug) prog.printState();
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage() + "\n\tcaused by " + e.getCause());
        }
        return -1;
    }
}
