package com.apl.quirkyfun.language.model.variable.function.error;

public class QuirkyFunctionException extends RuntimeException {
    public QuirkyFunctionException(String message) {
        super(message);
    }

    public QuirkyFunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirkyFunctionException(Throwable cause) {
        super(cause);
    }

    public QuirkyFunctionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
