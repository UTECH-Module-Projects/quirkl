package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FunctionExp extends Exp {
    private QuirklFunc func;

    public FunctionExp(QuirklCoord coord, String scope, QuirklFunc func) {
        super(coord, scope);
        this.func = func;
    }

    public FunctionExp(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.func = null;
    }

    @Override
    public String toString() {
        return func.toString();
    }

    @Override
    public QuirklType<?> eval() {
        return this.func;
    }
}
