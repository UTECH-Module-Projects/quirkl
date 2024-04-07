package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.compile;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class QuirklDeclarationException extends QuirklRuntimeException {

    public QuirklDeclarationException(String message, String scope, QuirklCoord coord) {
        super(message, scope, coord);
    }

    public static QuirklDeclarationException undeclaredVariable(String varName, String scope, QuirklCoord coord) {
        return new QuirklDeclarationException(String.format("Variable %s is not defined", varName), scope, coord);
    }

    public static QuirklDeclarationException variableAlreadyDeclared(Var<?> var, String scope, QuirklCoord coord) {
        return new QuirklDeclarationException(String.format("Variable %s already declared at %s", var.getId(), var.getCoord()), scope, coord);
    }
}
