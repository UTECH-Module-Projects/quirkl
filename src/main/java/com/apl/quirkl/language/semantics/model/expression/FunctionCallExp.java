package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

import java.util.List;

@Getter
public class FunctionCallExp extends Exp {

    private final QuirklFunc func;
    private final List<Exp> arguments;

    public FunctionCallExp(QuirklCoord coord, String scope, QuirklFunc func, List<Exp> arguments) {
        super(coord, scope);
        this.func = func;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        QuirklFuncValue value = func.getValue();
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
            QuirklFuncValue func = this.func.getValue();
            return func.apply(values);
        } catch (RuntimeException e) {
            throw new QuirklRuntimeException(e);
        }
    }
}
