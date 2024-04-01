package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;

import static com.apl.quirkl.language.semantics.model.statement.loop.LoopStmt.MAX_RUN;

public class QuirklLoopException extends QuirklRuntimeException {
    public QuirklLoopException(String message) {
        super(message);
    }

    private static QuirklLoopException newInstance(String message, QuirklCoord coord) {
        return new QuirklLoopException(message + getCoord(coord));
    }

    public static QuirklLoopException exceededLoopLimit(QuirklCoord coord) {
        return newInstance("For loop exceeded maximum iterations of " + MAX_RUN, coord);
    }
}
