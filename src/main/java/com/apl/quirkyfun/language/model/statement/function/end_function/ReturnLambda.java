package com.apl.quirkyfun.language.model.statement.function.end_function;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.QuirkyType;
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
    public QuirkyType<?> eval() {
        return this.returnExpression.eval();
    }
}
