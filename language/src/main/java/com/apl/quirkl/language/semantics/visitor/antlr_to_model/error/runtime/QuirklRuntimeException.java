package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklRuntimeException extends QuirklException {
    public QuirklRuntimeException(String message, String scope) {
        super(message, scope);
    }

    public QuirklRuntimeException(QuirklException e) {
        super(e);
    }

    public QuirklRuntimeException(Throwable cause, String scope) {
        super(cause, scope);
    }
}
