package com.apl.quirkyfun.language.semantics.model.variable.function.end_function;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.statement.Statement;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.QuirklVoid;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FunctionBody extends EndFunction {
    private QuirklList<Statement> statements;
    private Expression returnExpression;

    public FunctionBody() {
        this.statements = new QuirklList<>();
        this.returnExpression = null;
    }

    public FunctionBody(Expression returnExpression) {
        this.statements = new QuirklList<>();
        this.returnExpression = returnExpression;
    }

    public FunctionBody(QuirklList<Statement> statements, Expression returnExpression) {
        this.statements = statements;
        this.returnExpression = returnExpression;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        if (this.returnExpression == null) {
            return String.join("\n", this.statements.toStringArr());
        }
        return String.join("{\n", this.statements.toStringArr()) + "\ngive " + this.returnExpression + ";\n}";
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        for (Statement statement : this.statements)
            statement.eval();

        if (this.returnExpression == null)
            return QuirklVoid.VOID;

        return returnExpression.eval();
    }
}
