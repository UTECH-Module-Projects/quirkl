package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklVoid extends QuirklType<Void> {

    public static final QuirklVoid VOID = new QuirklVoid(QuirklCoord.ORIGIN);

    public QuirklVoid(QuirklCoord coord) {
        super(coord, null);
    }

    @Override
    public String toString() {
        return "null";
    }

    @Override
    public QuirklType<?> cast(Object value) throws QuirklCastException {
        return new QuirklVoid(this.getCoord());
    }

    @Override
    public QuirklVoid toVoid() throws QuirklCastException {
        return VOID;
    }

    @Override
    public QuirklBoolean toBoolean() throws QuirklCastException {
        return QuirklBoolean.FALSE;
    }

    @Override
    public QuirklLongNumber toLong() throws QuirklCastException {
        return QuirklLongNumber.ZERO;
    }

    @Override
    public QuirklDoubleNumber toDouble() throws QuirklCastException {
        return QuirklDoubleNumber.ZERO;
    }

    @Override
    public QuirklString toStr() throws QuirklCastException {
        return QuirklString.EMPTY;
    }

    @Override
    public QuirklFunction toFunction() throws QuirklCastException {
        return QuirklFunction.EMPTY;
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return 0;
    }

    @Override
    public QuirklType<?> add(QuirklType<?> other) throws QuirklMathException {
        return other.cast(other.getValue());
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException {
        return other.negate();
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException {
        return this.toLong().multiply(other);
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        return this.toLong().divide(other);
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException {
        return this.toLong().modulus(other);
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklMathException {
        return this.toLong().power(other);
    }

    @Override
    public QuirklType<?> root(QuirklType<?> other) throws QuirklMathException {
        return this.toLong().root(other);
    }

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        return QuirklLongNumber.ZERO;
    }

}
