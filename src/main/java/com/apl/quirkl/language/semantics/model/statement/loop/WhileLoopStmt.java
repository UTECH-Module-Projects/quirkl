package com.apl.quirkl.language.semantics.model.statement.loop;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklLoopException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WhileLoopStmt extends LoopStmt {

    private final boolean isDoWhile;
    private final ToBoolExp condition;
    private QuirklList<Stmt> body;

    public WhileLoopStmt(QuirklCoord coord, String scope, boolean isDoWhile, ToBoolExp condition) {
        super(coord, scope);
        this.isDoWhile = isDoWhile;
        this.condition = condition;
        this.body = new QuirklList<>();
    }

    @Override
    protected void runLoop() throws QuirklRuntimeException {
        int iterations = 0;
        if (this.isDoWhile) {
            do {
                if (iterations++ > MAX_RUN)
                    throw QuirklLoopException.exceededLoopLimit(this.getCoord());
                for (Stmt stmt : body) {
                    stmt.eval();
                }
            } while (this.condition.eval().getValue());
        } else {
            while (this.condition.eval().getValue()) {
                if (iterations++ > MAX_RUN)
                    throw QuirklLoopException.exceededLoopLimit(this.getCoord());
                for (Stmt stmt : body) {
                    stmt.eval();
                }
            }
        }
    }
}
