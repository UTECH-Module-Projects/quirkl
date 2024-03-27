package com.apl.quirkyfun.language.model.expression;

import com.apl.quirkyfun.language.model.type.QuirkyFunctionType;
import com.apl.quirkyfun.language.model.variable.function.Function;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import lombok.Getter;

import java.util.List;

@Getter
public class FunctionCallExpression extends Expression {
    private final QuirkyFunctionType func;
    private final List<Expression> parameters;

    public FunctionCallExpression(QuirkyFunctionType func, List<Expression> parameters) {
        this.func = func;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        Function value = (Function) func.getValue();
        return value.getName() + "(" + String.join(", ", value.getParameters().toStringArr()) + ")";
    }

    @Override
    public QuirkyType eval() throws QuirkyMathException {
        var values = parameters.stream().map(Expression::eval).toArray(QuirkyType[]::new);
        Function value = (Function) func.getValue();
        return value.apply(values);
    }
}
