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
        AtomicInteger i = new AtomicInteger(-1);
        if (this.catchStatement != null) {
            try {
                runLoop(i);
            } catch (QuirklRuntimeException e) {
                if (i.get() != -1)
                    this.catchStatement.setError(e, this.body.get(i.get()).getMyScope());
                else this.catchStatement.setError(e, this.getScope());
                this.catchStatement.eval();
            }
        } else runLoop(i);

        return QuirklVoid.VOID;
    }

    @Override
    public void reset() {
        for (Stmt stmt : body) {
            stmt.reset();
        }
    }

    protected abstract void runLoop(AtomicInteger i) throws QuirklRuntimeException;


}
