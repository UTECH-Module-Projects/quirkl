package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklCastException extends QuirklMathException {

    public QuirklCastException(String message, String scope) {
        super(message, scope);
    }

    public QuirklCastException(QuirklException e) {
        super(e);
    }

    public QuirklCastException(Throwable cause, String scope) {
        super(cause, scope);
    }

    public static QuirklCastException notCompatible(String value, QuirklType.TYPE type, String scope) {
        return new QuirklCastException(String.format("Cannot cast %s to a %s", value, type), scope);
    }
}
