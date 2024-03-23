package com.apl.quirkyfun.language.model.program;

import com.apl.quirkyfun.language.model.statement.Statement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Program {

    private final List<Statement> statements;

    public Program() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }
}
