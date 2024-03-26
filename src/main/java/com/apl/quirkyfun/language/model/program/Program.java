package com.apl.quirkyfun.language.model.program;

import com.apl.quirkyfun.language.model.statement.Statement;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.variable.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Program {

    public static final Program INSTANCE = new Program();

    private final List<Statement> statements;
    private final Map<String, Variable<QuirkyType<?>>> variables = new HashMap<>();
    private final List<String> errors = new ArrayList<>();

    protected Program() {
        this.statements = new ArrayList<>();
    }

    protected Program(List<Statement> statements) {
        this.statements = statements;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    public boolean hasVariable(String name) {
        return this.variables.containsKey(name);
    }

    public Variable<QuirkyType<?>> getVariable(String name) {
        return this.variables.get(name);
    }

    public void addVariable(Variable<QuirkyType<?>> variable) {
        this.variables.put(variable.getId(), variable);
    }

    public void addError(String error) {
        this.errors.add(error);
    }
}
