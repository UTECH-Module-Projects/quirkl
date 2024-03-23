package com.apl.quirkyfun.controller;

import com.apl.quirkyfun.language.lexer.QuirkyFunLexer;
import com.apl.quirkyfun.language.parser.QuirkyFunParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        args[0] =
                """
                        x: int = 5;
                        pass (y: int) to addNumber: int -> x + y;
                        addNumber(3);
                        """;

        QuirkyFunLexer lexer = new QuirkyFunLexer(CharStreams.fromString(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirkyFunParser parser = new QuirkyFunParser(tokens);

        /*QuirkyFunMainVisitor visitor = new QuirkyFunMainVisitor();
        visitor.visit(parser.program());*/
    }
}
