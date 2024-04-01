package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.variable.Var;

public class QuirklSummationException extends QuirklMathException {
    public QuirklSummationException(String message) {
        super(message);
    }

    public static QuirklSummationException notAFunction(Var<?> var) {
        return new QuirklSummationException("Variable " + var.getId() + " is not a function");
    }
}
