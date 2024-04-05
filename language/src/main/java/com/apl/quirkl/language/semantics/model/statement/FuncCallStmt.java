package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class FuncCallStmt extends Stmt {
    protected Var<QuirklFunc> varFunc;
    private QuirklList<Exp> arguments;

    public FuncCallStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.arguments = new QuirklList<>();
    }

    public FuncCallStmt(QuirklCoord coord, String scope, Var<QuirklFunc> varFunc, QuirklList<Exp> arguments) {
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
        QuirklFuncValue func = this.varFunc.getValue().getValue();
        return func.apply(values);
    }
}
