package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.QuirklError;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public class CatchStmt extends Stmt {
    private final Prog prog;
    private final Var<QuirklError> errVar;
    private final QuirklList<Stmt> body;

    public CatchStmt(QuirklCoord coord, String scope, Prog prog, Var<QuirklError> errVar) {
        super(coord, scope);
        this.prog = prog;
        this.errVar = errVar;
        this.body = new QuirklList<>();
    }

    public void setError(QuirklException e, String scope) {
        errVar.setValue(new QuirklError(e, this.prog, scope));
    }

    @Override
    public QuirklVoid eval() throws QuirklRuntimeException {
        for (Stmt stmt : body) {
            stmt.eval();
        }
        return QuirklVoid.VOID;
    }
}
