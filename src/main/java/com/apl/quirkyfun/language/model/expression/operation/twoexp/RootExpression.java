package com.apl.quirkyfun.language.model.expression.operation.twoexp;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyNumber;
import lombok.Getter;

@Getter
public class RootExpression extends TwoExpOperationExpression {

    protected RootExpression(Expression left, Expression right) {
        super(left, right);
    }

    public RootExpression(TwoExpOperationExpression exp) {
        super(exp);
    }

    @Override
    public String toString() {
        return this.left.toString() + " \\/ " + this.right.toString();
    }

    @Override
    public QuirkyNumber eval() throws QuirkyMathException {
        return ((QuirkyNumber) left.eval()).root((QuirkyNumber) right.eval());
    }
}
