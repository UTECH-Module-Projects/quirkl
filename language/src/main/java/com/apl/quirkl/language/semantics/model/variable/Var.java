package com.apl.quirkl.language.semantics.model.variable;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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
    public void setValue(QuirklType<?> value) throws QuirklCastException {
        if (this.type != value.getType())
            this.value = (T) value.toType(this.type);
        else
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
        return String.format("%s: %s%s", this.id, type.getSimpleType(), (this.isInitialized() ? " = " + this.value.toString() : ""));
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
            throw new RuntimeException(e);
        }
    }

    public void reset() {
        this.value = null;
    }

    @SuppressWarnings("unchecked")
    public void setDefault() {
        this.value = (T) QuirklType.getDefault(this.type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Var<?> var)) return false;
        return type == var.type && Objects.equals(id, var.id) && Objects.equals(value, var.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, value);
    }
}
