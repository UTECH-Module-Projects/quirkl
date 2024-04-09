package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Setter;

@Setter
public class BracketExp extends Exp {
    private Exp exp;

    public BracketExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    @Override
    public String toString() {
        return "(" + this.exp.toString() + ")";
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return exp.eval();
    }
}
