package com.apl.quirkl.language.semantics.model.program;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Prog {

    public static final Prog INSTANCE = new Prog();

    private final QuirklCoord coord;
    private final QuirklList<Stmt> stmts;

    public static final String GLOBAL_SCOPE = "global";
    private final Map<String, Var<? extends QuirklType<?>>> symbolTable = new HashMap<>();
    private final Map<String, Stmt> scopeTable = new HashMap<>();
    private final List<QuirklException> errors = new ArrayList<>();

    public Prog() {
        this.coord = new QuirklCoord(0, 0);
        this.stmts = new QuirklList<>();
    }

    public boolean hasVariable(String name, String scope) {
        return this.symbolTable.containsKey(getVarKey(name, scope));
    }

    public boolean hasError() {
        return !this.errors.isEmpty();
    }

    public boolean hasStatement(String name) {
        return this.scopeTable.containsKey(name);
    }

    private String getVarKey(String name, String scope) {
        return String.format("%s:%s", scope, name);
    }

    public Var<?> getVar(String name, String scope) {
        String curScope = scope;
        do {
            Var<?> var = this.symbolTable.get(this.getVarKey(name, scope));
            if (var != null)
                return var;

            Stmt stmt = this.getStatement(curScope);
            if (stmt == null)
                return null;
            curScope = this.getStatement(curScope).getScope();
        } while (!curScope.equals(GLOBAL_SCOPE));
        return this.symbolTable.get(this.getVarKey(name, scope));
    }

    public Stmt getStatement(String scope) {
        return this.scopeTable.get(scope);
    }

    public void addVar(Var<?> var, String scope) {
        this.symbolTable.put(this.getVarKey(var.getId(), scope), var);
    }

    public void addScopeStatement(Stmt stmt, String id) {
        this.scopeTable.put(id, stmt);
    }

    public void addError(QuirklException error) {
        this.errors.add(error);
    }

    public void eval() throws QuirklRuntimeException {
        for (Stmt stmt : this.stmts) {
            stmt.eval();
        }
    }
}
