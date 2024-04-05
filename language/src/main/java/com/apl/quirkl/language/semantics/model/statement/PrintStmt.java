package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Setter;

@Setter
public class PrintStmt extends Stmt {
    private Exp expression;

    public PrintStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    @Override
    public String toString() {
        return String.format("print(%s);", this.expression);
    }

    @Override
    public QuirklVoid eval() throws QuirklRuntimeException {
        System.out.println(expression.eval().toStr().getValue());
        return QuirklVoid.VOID;
    }
}
