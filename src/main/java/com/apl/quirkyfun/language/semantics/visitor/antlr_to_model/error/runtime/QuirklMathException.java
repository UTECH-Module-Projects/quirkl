package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime;

public class QuirklMathException extends QuirklRuntimeException {
    public QuirklMathException(String message) {
        super(message);
    }

    public QuirklMathException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklMathException(Throwable cause) {
        super(cause);
    }

    public QuirklMathException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static QuirklMathException divideByZero() {
        return new QuirklMathException("Cannot divide a number by zero.");
    }

    public static QuirklMathException modByZero() {
        return new QuirklMathException("Cannot perform modulus operation with zero.");
    }
}
