package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.isEmpty;

@Getter
@Setter
public class FunctionCallExp extends Exp {

    private Var<QuirklFunc> varFunc;
    private final QuirklList<Exp> arguments;

    public FunctionCallExp(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.arguments = new QuirklList<>();
    }

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
        QuirklType<?>[] values = new QuirklType[arguments.size()];
        for (int i = 0; i < arguments.size(); i++) {
            values[i] = arguments.get(i).eval();
        }
        QuirklFunc varQuirklFunc = this.varFunc.getValue();
        if (isEmpty(varQuirklFunc))
            throw QuirklFunctionException.functionNotInitialized(this.varFunc, this.scope, this.coord);

        QuirklFuncValue func = varQuirklFunc.getValue();
        func.setCoord(this.getCoord());
        func.setScope(this.getScope());
        return func.apply(values);
    }
}
