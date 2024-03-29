package com.apl.quirkyfun.language.semantics.model.coordinate;

import lombok.Getter;

@Getter
public class QuirklCoordinate {
    private final int row;
    private final int column;

    public QuirklCoordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format("(%d: %d)", row, column);
    }
}
