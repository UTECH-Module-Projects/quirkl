package com.apl.quirkl.language.semantics.model.statement.loop;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.CatchStmt;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklLoopException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class ForLoopStmt extends LoopStmt {
    private Stmt init;
    private ToBoolExp condition;
    private Stmt update;

    public ForLoopStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.init = null;
        this.condition = null;
        this.update = null;
    }

    @Override
    public String toString() {
        return String.format("run (%s %s; %s) { %s }", this.init, this.condition, this.update, String.join("\n", this.body.toStringArr()));
    }

    @Override
    protected void runLoop(AtomicInteger i) throws QuirklRuntimeException {
        int iterations = 0;

        if (this.init != null) this.init.eval();
        while (this.condition.eval().getValue()) {
            if (iterations++ > MAX_RUN)
                throw QuirklLoopException.exceededLoopLimit(this.getCoord());

            while (i.incrementAndGet() < this.body.size()) {
                this.body.get(i.get()).eval();
            }
            i.set(-1);
            if (this.update != null) this.update.eval();
            this.reset();
        }
    }
}
