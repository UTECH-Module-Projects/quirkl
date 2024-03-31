package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.operation.TwoExpOpExp;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;

public class QuirklString extends QuirklType<String> {

    public static final QuirklString EMPTY = new QuirklString(QuirklCoord.ORIGIN, "");

    public QuirklString() {
        super(QuirklCoord.ORIGIN, "");
    }

    public QuirklString(QuirklCoord coord) {
        super(coord, "");
    }

    public QuirklString(QuirklCoord coord, String value) {
        super(coord, value);
    }

    @Override
    public QuirklString cast(QuirklCoord coord, Object value) {
        return new QuirklString(coord, value.toString());
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBoolean toBoolean() {
        return new QuirklBoolean(this.getCoord(), !this.value.isEmpty());
    }

    @Override
    public QuirklLongNumber toLong() throws QuirklCastException {
        try {
            return new QuirklLongNumber(this.getCoord(),Long.parseLong(this.value));
        } catch (NumberFormatException e) {
            throw QuirklCastException.notCompatible(this.value, QuirklType.TYPE.LONG_NUMBER);
        }
    }

    @Override
    public QuirklDoubleNumber toDouble() throws QuirklCastException {
        try {
            return new QuirklDoubleNumber(this.getCoord(), Double.parseDouble(this.value));
        } catch (NullPointerException | NumberFormatException e) {
            throw QuirklCastException.notCompatible(this.value, QuirklType.TYPE.DOUBLE_NUMBER);
        }
    }

    @Override
    public QuirklString toStr() {
        return this.cast(this.getCoord(), this.value);
    }

    @Override
    public QuirklFunction toFunction() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.value, QuirklType.TYPE.FUNCTION);
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toStr().getValue());
    }

    @Override
    public QuirklType<String> add(QuirklType<?> other) throws QuirklCastException {
        return new QuirklString(this.getCoord(),this.value + other.toStr().getValue());
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
