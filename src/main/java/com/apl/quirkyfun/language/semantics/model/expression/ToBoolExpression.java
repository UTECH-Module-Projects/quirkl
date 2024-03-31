package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class ToBoolExpression extends Expression {
    private final Expression exp;

    public ToBoolExpression(QuirklCoordinate coord, Expression exp) {
        super(coord);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "?(" + this.exp.toString() + ")";
    }

    @Override
    public QuirklBoolean eval() throws QuirklRuntimeException {
        return exp.eval().toBoolean();
    }
}
