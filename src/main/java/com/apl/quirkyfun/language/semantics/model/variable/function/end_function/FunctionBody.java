package com.apl.quirkyfun.language.semantics.model.variable.function.end_function;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.statement.Statement;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.QuirklVoid;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import lombok.Getter;

@Getter
public class FunctionBody extends EndFunction {
    private final QuirklList<Statement> statements;
    private final Expression returnExpression;

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
    public QuirklType<?> eval() {
        for (Statement statement : this.statements)
            statement.eval();

        if (this.returnExpression == null)
            return new QuirklVoid();

        return returnExpression.eval();
    }
}
