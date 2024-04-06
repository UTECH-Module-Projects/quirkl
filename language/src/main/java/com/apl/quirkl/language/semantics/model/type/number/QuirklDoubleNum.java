package com.apl.quirkl.language.semantics.model.type.number;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklDoubleNum extends QuirklNum<Double> {

    public static final QuirklDoubleNum ZERO = new QuirklDoubleNum(0D, Prog.INSTANCE);
    public static final QuirklDoubleNum ONE = new QuirklDoubleNum(1D, Prog.INSTANCE);

    public QuirklDoubleNum() {
        super(0D, Prog.INSTANCE);
    }

    public QuirklDoubleNum(Double value, ProgTerm term) {
        super(value, term);
    }

    public QuirklDoubleNum(QuirklDoubleNum value) {
        super(value.getValue(), value.getTerm());
    }

    @Override
    public QuirklDoubleNum cast(Object other) throws QuirklCastException {
        if (other instanceof Boolean) return (Boolean) other ? new QuirklDoubleNum(1D, this.getTerm()) : new QuirklDoubleNum(0D, this.getTerm());
        String value = other.toString();
        try {
            return new QuirklDoubleNum(Double.valueOf(value), this.getTerm());
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value, TYPE.DOUBLE_NUMBER, this.getMyScope(), this.getTerm().getCoord());
        }
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toDouble().getValue());
    }
}
