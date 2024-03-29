package com.apl.quirkyfun.controller;

import com.apl.quirkyfun.language.lexer.QuirklLexer;
import com.apl.quirkyfun.language.parser.QuirklParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        args[0] =
                """
                        x: num = 5;
                        pass (y: num) to addNumber: num -> x + y;
                        pass (y: num) to addNumber: num {
                            give x + y;
                        }
                        addNumber(3);
                        
                        if ?(x > 5) {
                        }
                        
                        run {
                        } catch (e) {
                        }
                        
                        run (x: num = 3; ?(x <13); ++x) {
                        } catch (e) {
                        }
                        """;

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        /*QuirkyFunMainVisitor visitor = new QuirkyFunMainVisitor();
        visitor.visit(parser.program());*/
    }
}
