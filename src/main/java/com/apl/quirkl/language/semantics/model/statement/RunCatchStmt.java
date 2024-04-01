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
    public QuirklVoid eval() throws QuirklRuntimeException {
        try {
            for (Stmt stmt : body) {
                stmt.eval();
            }
        } catch (QuirklRuntimeException e) {
            catchStmt.setError(e, this.getScope());
            catchStmt.eval();
        }
        return QuirklVoid.VOID;
    }
}
