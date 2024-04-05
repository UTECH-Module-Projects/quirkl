package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public abstract class Stmt extends ProgTerm {
    public Stmt(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    public abstract QuirklType<?> eval() throws QuirklRuntimeException;
    public void reset() {}
}
