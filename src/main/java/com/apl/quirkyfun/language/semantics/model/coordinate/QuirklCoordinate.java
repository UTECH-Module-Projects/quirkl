package com.apl.quirkyfun.language.semantics.model.coordinate;

import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import lombok.Getter;

@Getter
public class QuirklCoordinate {
    private final int row;
    private final int column;

    public QuirklCoordinate() {
        this.row = 0;
        this.column = 0;
    }

    public QuirklCoordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format("(%d: %d)", row, column);
    }

    @Override
    public QuirklCoordinate clone() {
        try {
            super.clone();
            return new QuirklCoordinate(this.row, this.column);
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
