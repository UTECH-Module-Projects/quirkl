package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import lombok.Setter;

@Setter
public class QuirklException extends Exception {

    public QuirklException(String message, QuirklCoordinate coord) {
        super(message);
    }

    public QuirklException(String message, Throwable cause, QuirklCoordinate coord) {
        super(message, cause);
    }

    public QuirklException(Throwable cause, QuirklCoordinate coord) {
        super(cause);
    }

    protected QuirklException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    protected static String getCoord(QuirklCoordinate coord) {
        return "|" + coord;
    }
}
