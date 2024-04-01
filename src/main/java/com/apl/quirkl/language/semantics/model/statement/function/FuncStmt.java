package com.apl.quirkl.language.semantics.model.statement.function;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public class FuncStmt extends Stmt {
    protected final QuirklFunc func;

    public FuncStmt(QuirklCoord coord, String scope, QuirklFunc func) {
        super(coord, scope);
        this.func = func;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return this.func;
    }
}
