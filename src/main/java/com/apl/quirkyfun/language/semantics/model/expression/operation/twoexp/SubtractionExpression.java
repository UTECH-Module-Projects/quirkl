package com.apl.quirkyfun.language.semantics.model.expression.operation.twoexp;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklNumber;
import lombok.Getter;

@Getter
public class SubtractionExpression extends TwoExpOperationExpression {

    public SubtractionExpression(Expression left, Expression right) {
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
    public QuirklNumber eval() {
        return ((QuirklNumber) left.eval()).subtract((QuirklNumber) right.eval());
    }
}
