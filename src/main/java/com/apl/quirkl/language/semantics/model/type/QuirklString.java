package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;

public class QuirklString extends QuirklType<String> {

    public static final QuirklString EMPTY = new QuirklString("");

    public QuirklString() {
        super("");
    }

    public QuirklString(String value) {
        super(value);
    }

    @Override
    public QuirklString cast(Object value) {
        return new QuirklString(value.toString());
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBool toBoolean() {
        return new QuirklBool(!this.value.isEmpty());
    }

    @Override
    public QuirklLongNum toLong() throws QuirklCastException {
        try {
            return new QuirklLongNum(Long.parseLong(this.value));
        } catch (NumberFormatException e) {
            throw QuirklCastException.notCompatible(this.value, QuirklType.TYPE.LONG_NUMBER);
        }
    }

    @Override
    public QuirklDoubleNum toDouble() throws QuirklCastException {
        try {
            return new QuirklDoubleNum(Double.parseDouble(this.value));
        } catch (NullPointerException | NumberFormatException e) {
            throw QuirklCastException.notCompatible(this.value, QuirklType.TYPE.DOUBLE_NUMBER);
        }
    }

    @Override
    public QuirklString toStr() {
        return this.cast(this.value);
    }

    @Override
    public QuirklFunc toFunction() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.value, QuirklType.TYPE.FUNCTION);
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toStr().getValue());
    }

    @Override
    public QuirklType<String> add(QuirklType<?> other) throws QuirklCastException {
        return new QuirklString(this.value + other.toStr().getValue());
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MINUS.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MULTIPLY.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.DIVIDE.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MODULO.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.POWER.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> root(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.ROOT.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MINUS.toString(), this.getType());
    }

}
