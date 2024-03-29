package com.apl.quirkyfun.language.semantics.model.variable;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Variable {

    private final QuirklCoordinate coord;
    protected final String type;
    protected final String id;
    @Setter
    private QuirklType<?> value;

    public Variable(QuirklCoordinate coord, String type) {
        this.coord = coord;
        this.type = type;
        this.id = null;
        this.value = null;
    }

    public Variable(QuirklCoordinate coord, String type, String id) {
        this.coord = coord;
        this.type = type;
        this.id = id;
        this.value = null;
    }

    public Variable(QuirklCoordinate coord, String type, String id, QuirklType<?> value) {
        this.coord = coord;
        this.type = type;
        this.id = id;
        this.value = value;
    }

    public boolean isInitialized() {
        return this.value != null;
    }

    @Override
    public String toString() {
        return this.id + ": " + type + (this.isInitialized() ? " = " + this.value.toString() : "");
    }
}
