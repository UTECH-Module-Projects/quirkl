package com.apl.quirkyfun.language.model.expression.operation.twoexp;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.expression.operation.twoexp.TwoExpOperationExpression;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyNumber;
import lombok.Getter;

@Getter
public class MultiplicationExpression extends TwoExpOperationExpression {

    protected MultiplicationExpression(Expression left, Expression right) {
        super(left, right);
    }

    public MultiplicationExpression(TwoExpOperationExpression exp) {
        super(exp);
    }

    @Override
    public String toString() {
        return this.left.toString() + " * " + this.right.toString();
    }

    @Override
    public QuirkyNumber eval() throws QuirkyMathException {
        return ((QuirkyNumber) left.eval()).multiply((QuirkyNumber) right.eval());
    }
}
