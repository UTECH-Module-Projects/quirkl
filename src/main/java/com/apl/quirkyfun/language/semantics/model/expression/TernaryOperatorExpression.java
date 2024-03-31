package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class TernaryOperatorExpression extends Expression {
    private final ToBoolExpression toBool;
    private final Expression expTrue;
    private final Expression expFalse;

    public TernaryOperatorExpression(QuirklCoordinate coord, ToBoolExpression toBool, Expression expTrue, Expression expFalse) {
        super(coord);
        this.toBool = toBool;
        this.expTrue = expTrue;
        this.expFalse = expFalse;
    }

    @Override
    public String toString() {
        return toBool.toString() + " -> " + expTrue.toString() + " : " + expFalse.toString();
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return toBool.eval().getValue() ? expTrue.eval() : expFalse.eval();
    }
}
