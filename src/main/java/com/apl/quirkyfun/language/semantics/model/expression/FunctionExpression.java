package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class FunctionExpression extends Expression {
    private final QuirklFunction func;

    public FunctionExpression(QuirklCoordinate coord, QuirklFunction func) {
        super(coord);
        this.func = func;
    }

    @Override
    public String toString() {
        return func.toString();
    }

    @Override
    public QuirklType<?> eval() {
        return this.func;
    }
}
