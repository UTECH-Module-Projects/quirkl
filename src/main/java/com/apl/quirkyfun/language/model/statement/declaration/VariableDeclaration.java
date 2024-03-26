package com.apl.quirkyfun.language.model.statement.declaration;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.variable.Variable;
import lombok.Getter;

@Getter
public class VariableDeclaration extends DeclarationStatement {

    private final Variable variable;
    private final Expression expression;

    public VariableDeclaration(Variable variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public QuirkyType eval() {
        return null;
    }
}
