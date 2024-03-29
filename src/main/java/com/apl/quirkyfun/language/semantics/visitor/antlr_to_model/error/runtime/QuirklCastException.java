package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime;

public class QuirklCastException extends QuirklMathException {
    public QuirklCastException(String message) {
        super(message);
    }

    public QuirklCastException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklCastException(Throwable cause) {
        super(cause);
    }

    protected QuirklCastException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static QuirklCastException invalidBooleanFormat(String str) {
        return new QuirklCastException(String.format("Cannot parse %s to a boolean", str));
    }

    public static QuirklCastException invalidNumberFormat(String str) {
        return new QuirklCastException(String.format("Cannot parse %s to a number", str));
    }
}
