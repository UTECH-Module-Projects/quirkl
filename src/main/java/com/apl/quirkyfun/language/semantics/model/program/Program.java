package com.apl.quirkyfun.language.semantics.model.program;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.statement.Statement;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.QuirklException;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Program {

    public static final Program INSTANCE = new Program();

    private final QuirklCoord coord;
    private final List<Statement> statements;

    private final Map<String, Variable> symbolTable = new HashMap<>();
    private final List<QuirklException> errors = new ArrayList<>();

    public Program() {
        this.coord = new QuirklCoord(0, 0);
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    public boolean hasVariable(String name, String scope) {
        return this.symbolTable.containsKey(getKey(name, scope));
    }

    private String getKey(String name, String scope) {
        return String.format("%s:%s", scope, name);
    }

    public Variable getVariable(String name, String scope) {
        return this.symbolTable.get(this.getKey(name, scope));
    }

    public void addVariable(Variable variable, String scope) {
        this.symbolTable.put(this.getKey(variable.getId(), scope), variable);
    }

    public void addError(QuirklException error) {
        this.errors.add(error);
    }
}
