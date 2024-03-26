package com.apl.quirkyfun.language.model.expression.operation;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.variable.Variable;

public class VariableExpression extends Expression {
    private final Variable variable;

    public VariableExpression(Variable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return variable.getId();
    }

    @Override
    public QuirkyType eval() throws QuirkyMathException {
        return variable.getValue();
    }
}
