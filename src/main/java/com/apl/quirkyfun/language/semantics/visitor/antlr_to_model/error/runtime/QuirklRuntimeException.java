package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklRuntimeException extends QuirklException {
    public QuirklRuntimeException(String message) {
        super(message);
    }

    public QuirklRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklRuntimeException(Throwable cause) {
        super(cause);
    }

    protected QuirklRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
