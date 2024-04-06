package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklVariableException extends QuirklRuntimeException {
    public QuirklVariableException(String message, String scope, QuirklCoord coord) {
        super(message, scope, coord);
    }

    public QuirklVariableException(QuirklException e) {
        super(e);
    }

    public QuirklVariableException(Throwable cause, String scope, QuirklCoord coord) {
        super(cause, scope, coord);
    }
}
