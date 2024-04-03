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
                        a: num = -2;
                        b: num = 4;
                        
                        pass (a: num, b: num, fun: func) to sumWithFunc: num {
                            give a ~* b (fun);
                        }
                        
                        pass (x: num) to squared: num {
                            runZero: bool = ?(x);
                            result: num;
                            if ?(isZero) {
                                result = -34;
                            } else {
                                result: num = x * x;
                            }
                            
                            print("" + x + " * " + x + " = " + result);
                            give result;
                        }
                        
                        print("squared sum from " + a + " to " + b + " = " + sumWithFunc(a, b, squared));
                        """;

        /*
        * pass (y: num) to addNumber: num {
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
                        }*/

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(str));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        AntlrToProg visitor = new AntlrToProg();
        Prog prog = visitor.visitProgram(parser.program());

//        prog.printState();

        if (prog.hasError()) {
            prog.getErrors().getFirst().printStackTrace();
            return;
        }

        try {
            prog.eval();
        } catch (QuirklRuntimeException e) {
            e.printStackTrace();
        }
    }
}
