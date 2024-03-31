package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkyfun.language.semantics.model.variable.Variable;

public class QuirklSummationException extends QuirklMathException {
    public QuirklSummationException(String message) {
        super(message);
    }

    public QuirklSummationException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklSummationException(Throwable cause) {
        super(cause);
    }

    public QuirklSummationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static QuirklSummationException notAFunction(Variable var) {
        return new QuirklSummationException("Variable " + var.getId() + " is not a function");
    }
}
