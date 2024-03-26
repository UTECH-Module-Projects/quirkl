package com.apl.quirkyfun.language.model.type.error;

public class QuirkyMathException extends RuntimeException {
    public QuirkyMathException(String message) {
        super(message);
    }

    public QuirkyMathException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirkyMathException(Throwable cause) {
        super(cause);
    }

    public QuirkyMathException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
