package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.type.QuirklType;

public class QuirklCastException extends QuirklMathException {
    public QuirklCastException(String message) {
        super(message);
    }

    public static QuirklCastException notCompatible(String value, QuirklType.TYPE type) {
        return new QuirklCastException(String.format("Cannot cast %s to a %s", value, type));
    }
}
