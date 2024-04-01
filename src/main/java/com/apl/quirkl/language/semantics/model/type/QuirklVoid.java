package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklVoid extends QuirklType<Void> {

    public static final QuirklVoid VOID = new QuirklVoid();

    public QuirklVoid() {
        super(null);
    }

    @Override
    public String toString() {
        return "null";
    }

    @Override
    public QuirklType<?> cast(Object value) throws QuirklCastException {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklVoid toVoid() throws QuirklCastException {
        return VOID;
    }

    @Override
    public QuirklBool toBoolean() throws QuirklCastException {
        return QuirklBool.FALSE;
    }

    @Override
    public QuirklLongNum toLong() throws QuirklCastException {
        return QuirklLongNum.ZERO;
    }

    @Override
    public QuirklDoubleNum toDouble() throws QuirklCastException {
        return QuirklDoubleNum.ZERO;
    }

    @Override
    public QuirklString toStr() throws QuirklCastException {
        return QuirklString.EMPTY;
    }

    @Override
    public QuirklFunc toFunction() throws QuirklCastException {
        return QuirklFunc.EMPTY;
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
        return QuirklLongNum.ZERO;
    }

}
