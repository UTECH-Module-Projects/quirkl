package com.apl.quirkl.language.semantics.model.program;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
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
public class Prog extends ProgTerm {

    private final QuirklList<Stmt> stmts;

    public static final String GLOBAL_SCOPE = "global";
    private final Map<String, Var<? extends QuirklType<?>>> symbolTable = new HashMap<>();
    private final Map<String, ProgTerm> scopeTable = new HashMap<>();
    private final List<QuirklException> errors = new ArrayList<>();

    public static Prog INSTANCE = null;

    public Prog() {
        super(new QuirklCoord(0, 0), "null");
        this.stmts = new QuirklList<>();
    }

    public static void setProg(Prog prog) {
        INSTANCE = prog;
    }

    public boolean hasError() {
        return !this.errors.isEmpty();
    }

    private String getVarKey(String name, String scope) {
        return String.format("%s:%s", scope, name);
    }

    public Var<?> getVar(String name, String scope) {
        return this.symbolTable.get(this.getVarKey(name, scope));
    }

    public Var<?> getVarAllScope(String name, String scope) {
        String curScope = scope;
        do {
            Var<?> var = getVar(name, curScope);
            if (var != null)
                return var;

            ProgTerm term = this.getTerm(curScope);
            if (term == null)
                return null;
            curScope = this.getTerm(curScope).getScope();
        } while (!curScope.equals(GLOBAL_SCOPE));
        return getVar(name, curScope);
    }

    public ProgTerm getTerm(String scope) {
        return this.scopeTable.get(scope);
    }

    public void addVar(Var<?> var, String scope) {
        this.symbolTable.put(this.getVarKey(var.getId(), scope), var);
    }

    public void addScopeTerm(ProgTerm term, String id) {
        this.scopeTable.put(id, term);
    }

    public void addError(QuirklException error) {
        this.errors.add(error);
    }

    public QuirklType<?> eval() throws QuirklRuntimeException {
        for (Stmt stmt : this.stmts) {
            stmt.eval();
        }
        return QuirklVoid.VOID;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        this.stmts.forEach(stmt -> strBuilder.append(stmt.toString()).append("\n"));
        return strBuilder.toString();
    }

    public void printState() {
        System.out.println("\n\nSymbol Table:");
        this.symbolTable.forEach((k, v) -> System.out.printf("%31s -> %s%n", k, v.toString()));

        System.out.println("\nScope Table:");
        this.scopeTable.forEach((k, v) -> System.out.printf("%31s -> %s%n", k, v.toString()));
    }
}
