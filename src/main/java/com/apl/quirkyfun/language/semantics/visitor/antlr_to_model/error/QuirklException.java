package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import lombok.Setter;

@Setter
public class QuirklException extends Exception {

    public QuirklException(String message, QuirklCoord coord) {
        super(message);
    }

    public QuirklException(String message, Throwable cause, QuirklCoord coord) {
        super(message, cause);
    }

    public QuirklException(Throwable cause, QuirklCoord coord) {
        super(cause);
    }

    protected QuirklException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    protected static String getCoord(QuirklCoord coord) {
        return "|" + coord;
    }
}
