package com.apl.quirkl.controller;

import com.apl.quirkl.language.lexer.QuirklLexer;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToProg;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String str =
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
                            print(x);
                        } catch (e) {
                        }
                        """;

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(str));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        AntlrToProg visitor = new AntlrToProg();
        Prog prog = visitor.visitProgram(parser.program());

        if (prog.hasError()) {
            prog.getErrors().forEach(Throwable::printStackTrace);
            System.out.println("\nSymbol Table:");
            prog.getSymbolTable().forEach((k, v) -> System.out.println(k + " -> " + v));

            System.out.println("\nScope Table:");
            prog.getScopeTable().forEach((k, v) -> System.out.println(k + " -> " + v));
            return;
        }

        try {
            prog.eval();
        } catch (QuirklRuntimeException e) {
            e.printStackTrace();
        }
    }
}
