package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklErr;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatchStmt extends Stmt {
    private Var<QuirklErr> errVar;
    private final QuirklList<Stmt> body;

    public CatchStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.errVar = null;
        this.body = new QuirklList<>();
    }

    public void setError(QuirklException e) throws QuirklCastException {
        errVar.setValue(new QuirklErr(e));
    }

    @Override
    public String toString() {
        return "catch (e) { " + body.toStringBy(" ") + " }";
    }

    @Override
    public QuirklVoid eval() throws QuirklRuntimeException {
        for (Stmt stmt : body) {
            stmt.eval();
        }
        return QuirklVoid.VOID;
    }

    @Override
    public void reset() {
        for (Stmt stmt : body) {
            stmt.reset();
        }
    }
}
