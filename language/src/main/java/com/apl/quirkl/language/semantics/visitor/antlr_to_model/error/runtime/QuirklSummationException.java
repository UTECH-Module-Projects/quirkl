package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.variable.Var;

public class QuirklSummationException extends QuirklMathException {
    public QuirklSummationException(String message, String scope, QuirklCoord coord) {
        super(message, scope, coord);
    }

    public static QuirklSummationException notAFunction(Var<?> var, String scope, QuirklCoord coord) {
        return new QuirklSummationException("Variable " + var.getId() + " is not a function", scope, coord);
    }
}
