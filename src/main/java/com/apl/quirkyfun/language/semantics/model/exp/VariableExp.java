package com.apl.quirkyfun.language.semantics.model.exp;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import lombok.Getter;

@Getter
public class VariableExp extends Exp {

    private final Variable variable;

    public VariableExp(QuirklCoord coord, Variable variable) {
        super(coord);
        this.variable = variable;
    }

    @Override
    public String toString() {
        return variable.getId();
    }

    @Override
    public QuirklType<?> eval() throws QuirklMathException {
        return variable.getValue();
    }
}
