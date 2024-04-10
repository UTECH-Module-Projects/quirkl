package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import lombok.Getter;
import lombok.Setter;

@Getter
public class QuirklException extends Exception {

    protected final String scope;
    protected final QuirklCoord coord;

    public QuirklException(String message, String scope, QuirklCoord coord) {
        super(message);
        this.scope = scope;
        this.coord = coord;
    }

    public QuirklException(QuirklException e) {
        super(e.getMessage());
        this.scope = e.scope;
        this.coord = e.coord;
    }

    public QuirklException(Throwable cause, String scope, QuirklCoord coord) {
        super(cause);
        this.scope = scope;
        this.coord = coord;
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
