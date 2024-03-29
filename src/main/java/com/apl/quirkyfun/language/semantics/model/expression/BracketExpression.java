package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

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
    public QuirklType eval() throws QuirklMathException {
        return exp.eval();
    }
}
