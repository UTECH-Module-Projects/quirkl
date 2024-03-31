package com.apl.quirkyfun.language.semantics.model.statement;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

import java.util.List;

@Getter
public class FunctionCallStatement extends Statement {
    private final QuirklFunction func;
    private final List<Expression> arguments;

    public FunctionCallStatement(QuirklFunction func, List<Expression> arguments) {
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
