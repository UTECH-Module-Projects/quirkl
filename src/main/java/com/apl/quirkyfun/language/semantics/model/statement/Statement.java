package com.apl.quirkyfun.language.semantics.model.statement;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public abstract class Statement {

    protected final QuirklCoord coord;

    public Statement(QuirklCoord coord) {
        this.coord = coord;
    }

    public abstract QuirklType<?> eval() throws QuirklRuntimeException;
}
