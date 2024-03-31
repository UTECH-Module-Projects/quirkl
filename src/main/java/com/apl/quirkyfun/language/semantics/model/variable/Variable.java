package com.apl.quirkyfun.language.semantics.model.variable;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Variable implements Cloneable {

    private final QuirklCoordinate coord;
    private QuirklType.TYPE type;
    private String id;
    private QuirklType<?> value;

    public Variable(QuirklCoordinate coord) {
        this.coord = coord;
        this.type = null;
        this.id = null;
        this.value = null;
    }

    public Variable(QuirklCoordinate coord, String id) {
        this.coord = coord;
        this.id = id;
    }

    public Variable(QuirklCoordinate coord, QuirklType.TYPE type) {
        this.coord = coord;
        this.type = type;
        this.id = null;
        this.value = null;
    }

    public Variable(QuirklCoordinate coord, QuirklType.TYPE type, String id) {
        this.coord = coord;
        this.type = type;
        this.id = id;
        this.value = null;
    }

    public Variable(QuirklCoordinate coord, QuirklType.TYPE type, String id, QuirklType<?> value) {
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

    public void updateValue(QuirklType<?> value) throws QuirklCastException {
        this.value.setValue(value.getValue());
    }

    @Override
    public Variable clone() {
        try {
            super.clone();
            return new Variable(this.coord.clone(), this.type, this.id, this.value);
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
