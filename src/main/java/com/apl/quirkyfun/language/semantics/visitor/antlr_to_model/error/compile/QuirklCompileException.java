package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile;

import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklCompileException extends QuirklException {
    public QuirklCompileException(String message) {
        super(message);
    }

    public QuirklCompileException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklCompileException(Throwable cause) {
        super(cause);
    }

    protected QuirklCompileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static QuirklCompileException noDefaultValue(QuirklType.TYPE type) {
        return new QuirklCompileException(String.format("No default value for %s|", type));
    }
}
