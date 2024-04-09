package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TernaryOperatorExp extends Exp {
    private ToBoolExp toBool;
    private Exp expTrue;
    private Exp expFalse;

    public TernaryOperatorExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    @Override
    public String toString() {
        return toBool.toString() + " -> " + expTrue.toString() + " : " + expFalse.toString();
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return toBool.eval().getValue() ? expTrue.eval() : expFalse.eval();
    }
}
