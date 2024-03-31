package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import lombok.Getter;

@Getter
public class VariableExpression extends Expression {

    private final Variable variable;

    public VariableExpression(QuirklCoordinate coord, Variable variable) {
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
