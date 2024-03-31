package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

import java.util.List;

@Getter
public class FunctionCallExpression extends Expression {

    private final QuirklFunction func;
    private final List<Expression> arguments;

    public FunctionCallExpression(QuirklCoordinate coord, QuirklFunction func, List<Expression> arguments) {
        super(coord);
        this.func = func;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        Function value = func.getValue();
        return value.getId() + "(" + String.join(", ", value.getParameters().toStringArr()) + ")";
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        try {
            var values = arguments.stream().map(argument -> {
                try {
                    return argument.eval();
                } catch (QuirklRuntimeException e) {
                    throw new RuntimeException(e);
                }
            }).toArray(QuirklType[]::new);
            Function func = this.func.getValue();
            return func.apply(values);
        } catch (RuntimeException e) {
            throw new QuirklRuntimeException(e);
        }
    }
}
