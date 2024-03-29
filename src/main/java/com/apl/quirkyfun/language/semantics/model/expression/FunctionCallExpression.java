package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import lombok.Getter;

import java.util.List;

@Getter
public class FunctionCallExpression extends Expression {
    private final QuirklFunction func;
    private final List<Expression> parameters;

    public FunctionCallExpression(QuirklFunction func, List<Expression> parameters) {
        this.func = func;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        Function value = (Function) func.getValue();
        return value.getName() + "(" + String.join(", ", value.getParameters().toStringArr()) + ")";
    }

    @Override
    public QuirklType eval() throws QuirklMathException {
        var values = parameters.stream().map(Expression::eval).toArray(QuirklType[]::new);
        Function value = (Function) func.getValue();
        return value.apply(values);
    }
}
