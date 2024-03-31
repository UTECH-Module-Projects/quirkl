package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile;

import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;

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

    private static QuirklDeclarationException newInstance(String message, QuirklCoordinate coord) {
        return new QuirklDeclarationException(message + getCoord(coord));
    }

    public static QuirklDeclarationException undeclaredVariable(QuirklCoordinate coord, String varName) {
        String msg = String.format("Variable %s is not defined", varName);
        return newInstance(msg, coord);
    }

    public static QuirklDeclarationException variableAlreadyDeclared(QuirklCoordinate coord, Variable var) {
        String msg = String.format("Variable %s already declared", var.getId());
        return newInstance(msg, coord);
    }
}
