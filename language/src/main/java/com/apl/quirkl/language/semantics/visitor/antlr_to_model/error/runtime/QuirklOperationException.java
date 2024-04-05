package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklOperationException extends QuirklMathException {

    public QuirklOperationException(String message, String scope) {
        super(message, scope);
    }

    public QuirklOperationException(QuirklException e) {
        super(e);
    }

    public QuirklOperationException(Throwable cause, String scope) {
        super(cause, scope);
    }

    public static QuirklOperationException notCompatible(String operation, QuirklType.TYPE type1, QuirklType.TYPE type2, String scope) {
        return new QuirklOperationException(String.format("Operation '%s' is not compatible with types %s and %s", operation, type1, type2), scope);
    }

    public static QuirklOperationException notCompatible(String operation, QuirklType.TYPE type, String scope) {
        return new QuirklOperationException(String.format("Operation '%s' is not compatible with type %s", operation, type), scope);
    }

    public static QuirklOperationException invalidOperation(String operation, String scope) {
        return new QuirklOperationException(String.format("'%s' is not a valid operation.", operation), scope);
    }
}
