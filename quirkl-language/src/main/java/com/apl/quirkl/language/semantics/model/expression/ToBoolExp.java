package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklBool;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToBoolExp extends Exp {
    private Exp exp;

    public ToBoolExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    @Override
    public String toString() {
        return "?(" + this.exp.toString() + ")";
    }

    @Override
    public QuirklBool eval() throws QuirklRuntimeException {
        return exp.eval().toBoolean();
    }
}
