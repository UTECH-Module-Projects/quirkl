package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorStmt extends Stmt {

    private Exp exp;

    public ErrorStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    @Override
    public String toString() {
        return "err: " + exp + ";";
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        throw new QuirklRuntimeException(exp.eval().toStr().getValue(), this.getMyScope());
    }
}
