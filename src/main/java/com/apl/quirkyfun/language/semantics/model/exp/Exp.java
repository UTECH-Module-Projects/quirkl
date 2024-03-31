package com.apl.quirkyfun.language.semantics.model.exp;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public abstract class Exp {

    protected final QuirklCoord coord;

    public Exp(QuirklCoord coord) {
        this.coord = coord;
    }

    public abstract QuirklType<?> eval() throws QuirklRuntimeException;
}
