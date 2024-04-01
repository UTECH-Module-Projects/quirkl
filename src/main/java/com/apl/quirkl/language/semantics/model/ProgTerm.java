package com.apl.quirkl.language.semantics.model;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ProgTerm {
    protected QuirklCoord coord;
    protected String scope;

    public ProgTerm(QuirklCoord coord, String scope) {
        this.coord = coord;
        this.scope = scope;
    }

    public abstract QuirklType<?> eval() throws QuirklRuntimeException;
}
