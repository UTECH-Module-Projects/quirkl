package com.apl.quirkl.language.semantics.model.coordinate;

import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public class QuirklCoord implements Cloneable {
    private final int row;
    private final int column;

    public static final QuirklCoord ORIGIN = new QuirklCoord(0, 0);

    public QuirklCoord() {
        this.row = 0;
        this.column = 0;
    }

    public QuirklCoord(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format("%d:%d", row, column);
    }

    public QuirklCoord clone() {
        try {
            super.clone();
            return new QuirklCoord(this.row, this.column);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
