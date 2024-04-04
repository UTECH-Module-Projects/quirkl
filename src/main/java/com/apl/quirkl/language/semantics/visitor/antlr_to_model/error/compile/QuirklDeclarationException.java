package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.compile;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.variable.Var;

public class QuirklDeclarationException extends QuirklCompileException {
    public QuirklDeclarationException(String message) {
        super(message);
    }

    private static QuirklDeclarationException newInstance(String message, QuirklCoord coord) {
        return new QuirklDeclarationException(message + getCoord(coord));
    }

    public static QuirklDeclarationException undeclaredVariable(QuirklCoord coord, String varName) {
        String msg = String.format("Variable %s is not defined", varName);
        return newInstance(msg, coord);
    }

    public static QuirklDeclarationException variableAlreadyDeclared(QuirklCoord coord, Var<?> var) {
        String msg = String.format("Variable %s already declared", var.getId());
        return newInstance(msg, coord);
    }
}
