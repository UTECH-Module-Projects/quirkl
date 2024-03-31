package com.apl.quirkyfun.language.semantics.model.expression.operation.bool;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class NotBooleanExpression extends BooleanExpression {

    private final Expression exp;
    public static final String NOT = "!";

    public NotBooleanExpression(QuirklCoordinate coord, Expression exp) {
        super(coord);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return NOT + this.exp.toString();
    }

    @Override
    public QuirklBoolean eval() throws QuirklRuntimeException {
        return this.exp.eval().not();
    }
}
