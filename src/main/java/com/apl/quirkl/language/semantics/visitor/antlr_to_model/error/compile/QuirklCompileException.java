package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.compile;

import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklCompileException extends QuirklException {
    public QuirklCompileException(String message) {
        super(message);
    }

    public static QuirklCompileException noDefaultValue(QuirklType.TYPE type) {
        return new QuirklCompileException(String.format("No default value for %s|", type));
    }
}
