package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error;

public class QuirklException extends Exception {
    public QuirklException(String message) {
        super(message);
    }

    public QuirklException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklException(Throwable cause) {
        super(cause);
    }

    protected QuirklException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
