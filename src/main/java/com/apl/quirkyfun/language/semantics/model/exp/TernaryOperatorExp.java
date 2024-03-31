package com.apl.quirkyfun.language.semantics.model.exp;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class TernaryOperatorExp extends Exp {
    private final ToBoolExp toBool;
    private final Exp expTrue;
    private final Exp expFalse;

    public TernaryOperatorExp(QuirklCoord coord, ToBoolExp toBool, Exp expTrue, Exp expFalse) {
        super(coord);
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
