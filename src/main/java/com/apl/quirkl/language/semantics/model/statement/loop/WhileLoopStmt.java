package com.apl.quirkl.language.semantics.model.statement.loop;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklLoopException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class WhileLoopStmt extends LoopStmt {

    private final boolean isDoWhile;
    private final ToBoolExp condition;

    public WhileLoopStmt(QuirklCoord coord, String scope, boolean isDoWhile, ToBoolExp condition) {
        super(coord, scope);
        this.isDoWhile = isDoWhile;
        this.condition = condition;
    }

    @Override
    protected void runLoop(AtomicInteger i) throws QuirklRuntimeException {
        int iterations = 0;
        if (this.isDoWhile) {
            do {
                if (iterations++ > MAX_RUN)
                    throw QuirklLoopException.exceededLoopLimit(this.getCoord());

                while (i.incrementAndGet() < this.body.size()) {
                    this.body.get(i.get()).eval();
                }
                i.set(-1);
                this.reset();
            } while (this.condition.eval().getValue());
        } else {
            while (this.condition.eval().getValue()) {
                if (iterations++ > MAX_RUN)
                    throw QuirklLoopException.exceededLoopLimit(this.getCoord());
                while (i.incrementAndGet() < this.body.size()) {
                    this.body.get(i.get()).eval();
                }
                i.set(-1);
            }
        }
    }
}
