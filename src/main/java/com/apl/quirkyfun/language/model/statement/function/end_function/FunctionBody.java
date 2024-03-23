package com.apl.quirkyfun.language.model.statement.function.end_function;

import com.apl.quirkyfun.language.model.statement.Statement;
import com.apl.quirkyfun.language.model.util.QList;
import lombok.Getter;

@Getter
public class FunctionBody extends EndFunction {
    private final QList<Statement> statements;

    public FunctionBody() {
        this.statements = new QList<>();
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        return String.join("\n", this.statements.toStringArr());
    }
}
