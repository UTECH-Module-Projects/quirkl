package com.apl.quirkyfun.language.semantics.model.variable.function.end_function;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import lombok.Getter;

@Getter
public class ReturnLambda extends EndFunction {
    private final Expression<?> returnExpression;

    public ReturnLambda(Expression<?> returnExpression) {
        this.returnExpression = returnExpression;
    }

    @Override
    public String toString() {
        return this.returnExpression.toString();
    }

    @Override
    public QuirklType<?> eval() {
        return this.returnExpression.eval();
    }
}
