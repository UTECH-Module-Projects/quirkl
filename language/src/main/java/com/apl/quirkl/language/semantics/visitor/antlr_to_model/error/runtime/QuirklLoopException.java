package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

import static com.apl.quirkl.language.semantics.model.statement.loop.LoopStmt.MAX_RUN;

public class QuirklLoopException extends QuirklRuntimeException {

    public QuirklLoopException(String message, String scope) {
        super(message, scope);
    }

    public QuirklLoopException(QuirklException e) {
        super(e);
    }

    public QuirklLoopException(Throwable cause, String scope) {
        super(cause, scope);
    }

    public static QuirklLoopException exceededLoopLimit(String scope) {
        return new QuirklLoopException("Exceeded loop limit of " + MAX_RUN + " runs", scope);
    }
}
