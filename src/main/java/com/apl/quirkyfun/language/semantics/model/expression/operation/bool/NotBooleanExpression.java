package com.apl.quirkyfun.language.semantics.model.expression.operation.bool;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class NotBooleanExpression extends BooleanExpression {

    private final Expression exp;

    public NotBooleanExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return '!' + this.exp.toString();
    }

    @Override
    public QuirklBoolean eval() throws QuirklMathException {
        return ((QuirklBoolean) this.exp.eval()).not();
    }
}
