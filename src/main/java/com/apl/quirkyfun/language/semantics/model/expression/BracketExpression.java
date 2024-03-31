package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class BracketExpression extends Expression {
    private final Expression exp;

    public BracketExpression(QuirklCoordinate coord, Expression exp) {
        super(coord);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "(" + this.exp.toString() + ")";
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return exp.eval();
    }
}
