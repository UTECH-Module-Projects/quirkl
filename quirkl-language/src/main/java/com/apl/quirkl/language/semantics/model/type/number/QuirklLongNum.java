package com.apl.quirkl.language.semantics.model.type.number;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklLongNum extends QuirklNum<Long> {

    public static final QuirklLongNum ZERO = new QuirklLongNum(0L, Prog.INSTANCE);
    public static final QuirklLongNum ONE = new QuirklLongNum(1L, Prog.INSTANCE);
    public static final QuirklLongNum NEG_ONE = new QuirklLongNum(-1L, Prog.INSTANCE);

    public QuirklLongNum(Long value, ProgTerm term) {
        super(value, term);
    }

    public QuirklLongNum() {
        super(0L, Prog.INSTANCE);
    }

    public QuirklLongNum(QuirklLongNum value) {
        super(value.getValue(), value.getTerm());
    }

    @Override
    public QuirklLongNum cast(Object other) throws QuirklCastException {
        if (other instanceof Boolean) return (Boolean) other ? new QuirklLongNum(1L, this.getTerm()) : new QuirklLongNum(0L, this.getTerm());
        String value = other.toString();
        try {
            return new QuirklLongNum(Double.valueOf(value).longValue(), this.getTerm());
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value, TYPE.LONG_NUMBER, this.getMyScope(), this.getTerm().getCoord());
        }
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toLong().getValue());
    }
}
