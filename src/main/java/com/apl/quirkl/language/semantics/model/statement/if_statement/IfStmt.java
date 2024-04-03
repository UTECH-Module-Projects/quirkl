package com.apl.quirkl.language.semantics.model.statement.if_statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IfStmt extends Stmt {

    private IfCondition firstCondition;

    public IfStmt(QuirklCoord coord, String scope, IfCondition firstCondition) {
        super(coord, scope);
        this.firstCondition = firstCondition;
    }

    public IfStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.firstCondition = new IfCondition(coord, scope);
    }

    @Override
    public QuirklVoid eval() throws QuirklRuntimeException {
        firstCondition.eval();
        return QuirklVoid.VOID;
    }

    @Override
    public String toString() {
        return this.firstCondition.toString();
    }
}
