package com.apl.quirkl.language.semantics.model.statement.loop;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.statement.CatchStmt;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public abstract class LoopStmt extends Stmt {

    protected CatchStmt catchStatement;
    public static final long MAX_RUN = 1000000;
    protected QuirklList<Stmt> body;

    public LoopStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.catchStatement = null;
        this.body = new QuirklList<>();
    }


    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        if (this.catchStatement != null) {
            try {
                runLoop();
            } catch (QuirklRuntimeException e) {
                this.catchStatement.setError(e);
                this.catchStatement.eval();
            }
        } else runLoop();

        return QuirklVoid.VOID;
    }

    @Override
    public void reset() {
        for (Stmt stmt : body) {
            stmt.reset();
        }
    }

    protected abstract void runLoop() throws QuirklRuntimeException;


}
