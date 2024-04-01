package com.apl.quirkl.language.semantics.model.variable;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Var<T extends QuirklType<?>> extends ProgTerm implements Cloneable {

    @Setter
    protected QuirklType.TYPE type;
    @Setter
    protected String id;
    protected T value;

    public Var(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.type = null;
        this.id = null;
        this.value = null;
    }

    @SuppressWarnings("unchecked")
    public void setValue(QuirklType<?> value) {
        this.value = (T) value;
    }

    @Override
    public T eval() {
        return this.value;
    }

    public Var(QuirklCoord coord, String scope, String id) {
        super(coord, scope);
        this.id = id;
    }

    public Var(QuirklCoord coord, String scope, QuirklType.TYPE type) {
        super(coord, scope);
        this.type = type;
        this.id = null;
        this.value = null;
    }

    public Var(QuirklCoord coord, String scope, QuirklType.TYPE type, String id) {
        super(coord, scope);
        this.type = type;
        this.id = id;
        this.value = null;
    }

    public Var(QuirklCoord coord, String scope, QuirklType.TYPE type, String id, T value) {
        super(coord, scope);
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
    public Var<T> clone() {
        try {
            super.clone();
            return new Var<>(this.coord.clone(), this.scope, this.type, this.id, this.value);
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
