package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklTypeException extends QuirklRuntimeException {
    public QuirklTypeException(String message) {
        super(message);
    }

    public QuirklTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklTypeException(Throwable cause) {
        super(cause);
    }

    protected QuirklTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
