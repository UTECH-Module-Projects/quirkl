package com.apl.quirkyfun.language.semantics.model.expression.operation.twoexp;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklNumber;
import lombok.Getter;

@Getter
public class DivideExpression extends TwoExpOperationExpression {

    public DivideExpression(Expression left, Expression right) {
        super(left, right);
    }

    public DivideExpression(TwoExpOperationExpression exp) {
        super(exp);
    }

    @Override
    public String toString() {
        return this.left.toString() + " / " + this.right.toString();
    }

    @Override
    public QuirklNumber eval() throws QuirklMathException {
        return ((QuirklNumber) left.eval()).divide((QuirklNumber) right.eval());
    }
}
