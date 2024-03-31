package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkyfun.language.semantics.model.type.QuirklType;

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

    public static QuirklCastException notCompatible(String value, QuirklType.TYPE type) {
        return new QuirklCastException(String.format("Cannot cast %s to a %s", value, type));
    }
}
