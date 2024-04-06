package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.QuirklType.TYPE;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CastExp extends Exp {
    private Exp exp;
    private TYPE type;

    public CastExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return exp.eval().toType(type);
    }

}
