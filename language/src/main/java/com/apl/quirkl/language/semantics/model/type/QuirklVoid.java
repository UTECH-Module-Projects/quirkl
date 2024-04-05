package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklVoid extends QuirklType<Void> {

    public static final QuirklVoid VOID = new QuirklVoid();

    public QuirklVoid() {
        super(null, Prog.INSTANCE);
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
    public QuirklVoid toVoid() {
        return VOID;
    }

    @Override
    public QuirklBool toBoolean() {
        return QuirklBool.FALSE;
    }

    @Override
    public QuirklLongNum toLong() {
        return QuirklLongNum.ZERO;
    }

    @Override
    public QuirklDoubleNum toDouble() {
        return QuirklDoubleNum.ZERO;
    }

    @Override
    public QuirklString toStr() {
        return QuirklString.EMPTY;
    }

    @Override
    public QuirklFunc toFunction() {
        return QuirklFunc.EMPTY;
    }

    @Override
    public QuirklErr toError() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), TYPE.ERROR, this.getMyScope());
    }

    @Override
    public int compareTo(QuirklType<?> other) {
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
    public QuirklType<?> negate() {
        return QuirklLongNum.ZERO;
    }

}
