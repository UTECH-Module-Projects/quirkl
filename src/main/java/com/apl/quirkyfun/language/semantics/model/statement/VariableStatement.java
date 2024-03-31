package com.apl.quirkyfun.language.semantics.model.statement;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.QuirklVoid;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public class VariableStatement extends Statement {

    private final Variable variable;
    private final Expression expression;

    public VariableStatement(Variable variable) {
        this.variable = variable;
        this.expression = null;
    }

    public VariableStatement(Variable variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        if (expression != null) {
            variable.setValue(expression.eval());
            return QuirklVoid.VOID;
        }
        return variable.getValue();
    }
}
