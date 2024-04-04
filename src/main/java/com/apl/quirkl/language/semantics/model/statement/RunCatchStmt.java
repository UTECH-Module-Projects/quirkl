package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public class RunCatchStmt extends Stmt {
    private final QuirklList<Stmt> body;
    private final CatchStmt catchStmt;

    public RunCatchStmt(QuirklCoord coord, String scope, CatchStmt catchStmt) {
        super(coord, scope);
        this.catchStmt = catchStmt;
        this.body = new QuirklList<>();
    }

    @Override
    public String toString() {
        return "run { " + this.body.toStringBy(" ") + " } " + this.catchStmt;
    }

    @Override
    public QuirklVoid eval() throws QuirklRuntimeException {
        int i = 0;
        try {
            for (; i < this.body.size(); i++) {
                this.body.get(i).eval();
            }
        } catch (QuirklRuntimeException e) {
            catchStmt.setError(e, this.body.get(i).getMyScope());
            catchStmt.eval();
        }
        return QuirklVoid.VOID;
    }
}
