package com.apl.quirkyfun.language.model.expression.operation.twoexp;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.expression.operation.OperationExpression;
import com.apl.quirkyfun.language.model.expression.operation.bool.TwoExpBooleanExpression;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyNumber;

public class TwoExpOperationExpression extends OperationExpression<QuirkyNumber> {
    protected final Expression left;
    protected final Expression right;

    public TwoExpOperationExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public TwoExpOperationExpression(TwoExpOperationExpression exp) {
        this.left = exp.left;
        this.right = exp.right;
    }

    @Override
    public QuirkyNumber eval() throws QuirkyMathException {
        return null;
    }
}
