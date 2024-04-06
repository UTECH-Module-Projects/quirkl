package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklOperationException extends QuirklMathException {

    public QuirklOperationException(String message, String scope, QuirklCoord coord) {
        super(message, scope, coord);
    }

    public QuirklOperationException(QuirklException e) {
        super(e);
    }

    public QuirklOperationException(Throwable cause, String scope, QuirklCoord coord) {
        super(cause, scope, coord);
    }

    public static QuirklOperationException notCompatible(String operation, QuirklType.TYPE type1, QuirklType.TYPE type2, String scope, QuirklCoord coord) {
        return new QuirklOperationException(String.format("Operation '%s' is not compatible with types %s and %s", operation, type1, type2), scope, coord);
    }

    public static QuirklOperationException notCompatible(String operation, QuirklType.TYPE type, String scope, QuirklCoord coord) {
        return new QuirklOperationException(String.format("Operation '%s' is not compatible with type %s", operation, type), scope, coord);
    }

    public static QuirklOperationException invalidOperation(String operation, String scope, QuirklCoord coord) {
        return new QuirklOperationException(String.format("'%s' is not a valid operation.", operation), scope, coord);
    }
}
