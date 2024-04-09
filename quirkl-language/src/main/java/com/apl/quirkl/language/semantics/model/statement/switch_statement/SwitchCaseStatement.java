package com.apl.quirkl.language.semantics.model.statement.switch_statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SwitchCaseStatement extends Stmt {
    private Exp match;
    private final QuirklList<Stmt> body;

    public SwitchCaseStatement(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.match = null;
        this.body = new QuirklList<>();
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
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
