package com.apl.quirkyfun.language.model.expression;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;

public class BracketExpression extends Expression {
    private final Expression exp;

    public BracketExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "(" + this.exp.toString() + ")";
    }

    @Override
    public QuirkyType eval() throws QuirkyMathException {
        return exp.eval();
    }
}
