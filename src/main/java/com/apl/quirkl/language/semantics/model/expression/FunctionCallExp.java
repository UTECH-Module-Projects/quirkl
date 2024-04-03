package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public class FunctionCallExp extends Exp {

    private final Var<QuirklFunc> varFunc;
    private final QuirklList<Exp> arguments;

    public FunctionCallExp(QuirklCoord coord, String scope, Var<QuirklFunc> varFunc, QuirklList<Exp> arguments) {
        super(coord, scope);
        this.varFunc = varFunc;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return varFunc.getId() + "(" + String.join(", ", arguments.toStringArr()) + ")";
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
            QuirklFuncValue func = this.varFunc.getValue().getValue();
            return func.apply(values);
        } catch (RuntimeException e) {
            throw new QuirklRuntimeException(e);
        }
    }
}
