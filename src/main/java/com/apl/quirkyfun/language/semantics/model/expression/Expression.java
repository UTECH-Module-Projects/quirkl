package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public abstract class Expression {

    protected final QuirklCoordinate coord;

    public Expression(QuirklCoordinate coord) {
        this.coord = coord;
    }

    public abstract QuirklType<?> eval() throws QuirklRuntimeException;
}
