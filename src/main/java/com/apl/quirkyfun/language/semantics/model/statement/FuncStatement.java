package com.apl.quirkyfun.language.semantics.model.statement;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public class FuncStatement extends Statement {
    protected final QuirklFunction func;

    public FuncStatement(QuirklCoord coord, QuirklFunction func) {
        super(coord);
        this.func = func;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return this.func;
    }
}
