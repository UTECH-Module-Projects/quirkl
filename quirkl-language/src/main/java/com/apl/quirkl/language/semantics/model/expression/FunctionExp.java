package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.variable.Var;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FunctionExp extends Exp {
    private Var<QuirklFunc> varFunc;

    public FunctionExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    @Override
    public String toString() {
        return varFunc.toString();
    }

    @Override
    public QuirklFunc eval() {
        return this.varFunc.getValue();
    }
}
