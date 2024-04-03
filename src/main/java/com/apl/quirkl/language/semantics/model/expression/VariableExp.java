package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkl.language.semantics.model.variable.Var;
import lombok.Getter;

@Getter
public class VariableExp extends Exp {

    private final Var<?> var;

    public VariableExp(QuirklCoord coord, String scope, Var<?> var) {
        super(coord, scope);
        this.var = var;
    }

    @Override
    public String toString() {
        if (var.eval() != null)
            return var.eval().toString();
        return var.getId();
    }

    @Override
    public QuirklType<?> eval() throws QuirklMathException {
        return var.getValue();
    }
}
