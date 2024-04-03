package com.apl.quirkl.language.semantics.model.type.value.function.end_function;

import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncBody extends EndFunc {
    private QuirklList<Stmt> stmts;
    private Exp returnExp;

    public FuncBody() {
        this.stmts = new QuirklList<>();
        this.returnExp = null;
    }

    public FuncBody(Exp returnExp) {
        this.stmts = new QuirklList<>();
        this.returnExp = returnExp;
    }

    public FuncBody(QuirklList<Stmt> stmts, Exp returnExp) {
        this.stmts = stmts;
        this.returnExp = returnExp;
    }

    public void addStatement(Stmt stmt) {
        this.stmts.add(stmt);
    }

    @Override
    public String toString() {
        if (this.returnExp == null) {
            return "{ " + String.join(" ", this.stmts.toStringArr()) + " }";
        }
        return "{ " + String.join(" ", this.stmts.toStringArr()) + " give " + this.returnExp + "; }";
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        for (Stmt stmt : this.stmts)
            stmt.eval();

        if (this.returnExp == null)
            return QuirklVoid.VOID;

        return returnExp.eval();
    }
}
