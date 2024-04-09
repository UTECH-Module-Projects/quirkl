package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklRuntimeException extends QuirklException {
    public QuirklRuntimeException(String message, String scope, QuirklCoord coord) {
        super(message, scope, coord);
    }

    public QuirklRuntimeException(QuirklException e) {
        super(e);
    }

    public QuirklRuntimeException(Throwable cause, String scope, QuirklCoord coord) {
        super(cause, scope, coord);
    }
}
