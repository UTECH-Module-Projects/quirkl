package com.apl.quirkyfun.language.model.variable.function.end_function;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.statement.Statement;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.QuirkyVoid;
import com.apl.quirkyfun.language.model.util.QuirkyList;
import lombok.Getter;

@Getter
public class FunctionBody extends EndFunction {
    private final QuirkyList<Statement> statements;
    private final Expression<?> returnExpression;

    public FunctionBody() {
        this.statements = new QuirkyList<>();
        this.returnExpression = null;
    }

    public FunctionBody(Expression<?> returnExpression) {
        this.statements = new QuirkyList<>();
        this.returnExpression = returnExpression;
    }

    public FunctionBody(QuirkyList<Statement> statements, Expression<?> returnExpression) {
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
    public QuirkyType<?> eval() {
        for (Statement statement : this.statements)
            statement.eval();

        if (this.returnExpression == null)
            return new QuirkyVoid();

        return returnExpression.eval();
    }
}
