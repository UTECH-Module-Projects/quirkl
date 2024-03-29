package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkyfun.language.semantics.model.type.QuirklType;

public class QuirklOperationException extends QuirklMathException {
    public QuirklOperationException(String message) {
        super(message);
    }

    public QuirklOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklOperationException(Throwable cause) {
        super(cause);
    }

    protected QuirklOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static QuirklOperationException notCompatible(String operation, QuirklType.TYPE type1, QuirklType.TYPE type2) {
        return new QuirklOperationException(String.format("Operation %s is not compatible with types %s and %s", operation, type1, type2));
    }
}
