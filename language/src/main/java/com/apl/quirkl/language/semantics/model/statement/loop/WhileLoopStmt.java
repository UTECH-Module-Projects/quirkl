package com.apl.quirkl.language.semantics.model.statement.loop;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklLoopException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class WhileLoopStmt extends LoopStmt {

    private final boolean isDoWhile;
    private ToBoolExp condition;

    public WhileLoopStmt(QuirklCoord coord, String scope, boolean isDoWhile) {
        super(coord, scope);
        this.isDoWhile = isDoWhile;
    }

    @Override
    protected void runLoop() throws QuirklRuntimeException {
        int iterations = 0;
        if (this.isDoWhile) {
            System.out.println(this.condition.eval().getValue());
            do {
                if (iterations++ > MAX_RUN)
                    throw QuirklLoopException.exceededLoopLimit(this.getMyScope());

                for (Stmt stmt : this.body) {
                    stmt.eval();
                }
                this.reset();
            } while (this.condition.eval().getValue());
        } else {
            System.out.println(this.condition.eval().getValue());
            while (this.condition.eval().getValue()) {
                if (iterations++ > MAX_RUN)
                    throw QuirklLoopException.exceededLoopLimit(this.getMyScope());
                for (Stmt stmt : this.body) {
                    stmt.eval();
                }
                this.reset();
            }
        }
    }
}
