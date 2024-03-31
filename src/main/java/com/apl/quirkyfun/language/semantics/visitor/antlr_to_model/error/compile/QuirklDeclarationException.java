package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;

public class QuirklDeclarationException extends QuirklCompileException {
    public QuirklDeclarationException(String message) {
        super(message);
    }

    public QuirklDeclarationException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklDeclarationException(Throwable cause) {
        super(cause);
    }

    protected QuirklDeclarationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    private static QuirklDeclarationException newInstance(String message, QuirklCoord coord) {
        return new QuirklDeclarationException(message + getCoord(coord));
    }

    public static QuirklDeclarationException undeclaredVariable(QuirklCoord coord, String varName) {
        String msg = String.format("Variable %s is not defined", varName);
        return newInstance(msg, coord);
    }

    public static QuirklDeclarationException variableAlreadyDeclared(QuirklCoord coord, Variable var) {
        String msg = String.format("Variable %s already declared at %s", var.getId(), var.getCoord());
        return newInstance(msg, coord);
    }
}
