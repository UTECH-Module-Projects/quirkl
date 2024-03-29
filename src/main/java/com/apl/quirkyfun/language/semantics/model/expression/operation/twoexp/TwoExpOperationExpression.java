package com.apl.quirkyfun.language.semantics.model.expression.operation.twoexp;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.OperationExpression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklNumber;

public class TwoExpOperationExpression extends OperationExpression<QuirklNumber> {
    protected final Expression left;
    protected final Expression right;

    public enum OPERATORS {
        PLUS("+"),
        MINUS("-"),
        MULTIPLY("*"),
        DIVIDE("/"),
        MODULO("%"),
        POWER("^"),
        ROOT("/\\");

        OPERATORS(String operator) {
        }
    }

    public TwoExpOperationExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public TwoExpOperationExpression(TwoExpOperationExpression exp) {
        this.left = exp.left;
        this.right = exp.right;
    }

    @Override
    public QuirklNumber eval() throws QuirklMathException {
        return null;
    }
}
