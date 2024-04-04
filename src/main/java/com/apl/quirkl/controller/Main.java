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
                        **--
                        pass (a: num, b: num, fun: func) to sumWithFunc: num {
                            give a ~* b (fun);
                        }
                        
                        pass (x: num) to squared: num {
                            isZero: bool = !?(x);
                            result: num;
                            result = x * x;
                            **--
                            if ?(isZero) {
                                result = -34;
                            } else {
                                result = x * x;
                            }
                            --**
                            
                            print("" + x + " * " + x + " = " + result);
                            give result;
                        }
                        
                        myResult: dec = sumWithFunc(a, b, squared);
                        print("squared sum from " + a + " to " + b + " = " + myResult);
                        --**
                        
                        run (x: num = 3; ?(x < 13); x++) {
                            if ?(x == 3) {
                                err: "No Number 3!!!";
                            }
                        } catch (e) {
                            print(e);
                        }
                        
                        run {
                            test: func = 5;
                        } catch (e) {
                            print(e);
                        }
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


        if (prog.hasError()) {
            prog.getErrors().getFirst().printStackTrace();
            return;
        }

        prog.printState();

        try {
            System.out.println(prog);
            prog.eval();
        } catch (QuirklRuntimeException e) {
            e.printStackTrace();
        }
    }
}
