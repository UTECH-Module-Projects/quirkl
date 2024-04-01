package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import lombok.Setter;

@Setter
public class QuirklException extends Exception {

    public QuirklException(String message) {
        super(message);
    }

    public QuirklException(Throwable cause) {
        super(cause);
    }

    public String getErrorType() {
        return this.getClass().getSimpleName();
    }

    protected static String getCoord(QuirklCoord coord) {
        return "|" + coord;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.getErrorType(), this.getMessage());
    }
}
