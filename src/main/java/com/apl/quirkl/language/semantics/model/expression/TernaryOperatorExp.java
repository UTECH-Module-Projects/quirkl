package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class TernaryOperatorExp extends Exp {
    private final ToBoolExp toBool;
    private final Exp expTrue;
    private final Exp expFalse;

    public TernaryOperatorExp(QuirklCoord coord, String scope, ToBoolExp toBool, Exp expTrue, Exp expFalse) {
        super(coord, scope);
        this.toBool = toBool;
        this.expTrue = expTrue;
        this.expFalse = expFalse;
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
