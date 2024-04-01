package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklRuntimeException extends QuirklException {
    public QuirklRuntimeException(String message) {
        super(message);
    }

    public QuirklRuntimeException(Throwable cause) {
        super(cause);
    }
}
