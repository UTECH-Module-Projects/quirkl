package com.apl.quirkyfun.language.model.expression.operation;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.number.QNumberType;
import lombok.Getter;

@Getter
public class MultiplicationExpression<V extends Number> extends OperationExpression<V> {
    private final Expression<QNumberType> left;
    private final Expression<QNumberType> right;

    public MultiplicationExpression(Expression<QNumberType> left, Expression<QNumberType> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return this.left.toString() + " * " + this.right.toString();
    }

    @Override
    public QNumberType evaluate() {
        return null;
    }
}
