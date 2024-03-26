package com.apl.quirkyfun.language.model.expression.operation.twoexp;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.number.QuirkyNumber;
import lombok.Getter;

@Getter
public class SubtractionExpression extends TwoExpOperationExpression {

    protected SubtractionExpression(Expression left, Expression right) {
        super(left, right);
    }

    public SubtractionExpression(TwoExpOperationExpression exp) {
        super(exp);
    }

    @Override
    public String toString() {
        return this.left.toString() + " - " + this.right.toString();
    }

    @Override
    public QuirkyNumber eval() {
        return ((QuirkyNumber) left.eval()).subtract((QuirkyNumber) right.eval());
    }
}
