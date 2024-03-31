package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklBoolean extends QuirklType<Boolean> {

    public static final QuirklBoolean TRUE = new QuirklBoolean(true);
    public static final QuirklBoolean FALSE = new QuirklBoolean(false);

    public QuirklBoolean() {
        super(false);
    }

    public QuirklBoolean(Boolean value) {
        super(value);
    }

    public QuirklBoolean(QuirklBoolean value) {
        super(value.getValue());
    }

    @Override
    public QuirklBoolean cast(Object value) throws QuirklCastException {
        String valueStr = value.toString().toLowerCase();
        if (value instanceof Double) return (Double) value == 0 ? FALSE : TRUE;
        if (value instanceof Function) return valueStr.equals(QuirklFunction.EMPTY.toString()) ? FALSE : TRUE;
        if (valueStr.isBlank()) return FALSE;
        return switch (valueStr) {
            case "false", "null", "0" -> FALSE;
            default -> TRUE;
        };
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBoolean toBoolean() {
        return new QuirklBoolean(this);
    }

    @Override
    public QuirklLongNumber toLong() {
        return new QuirklLongNumber(this.getValue() ? QuirklLongNumber.ONE : QuirklLongNumber.ZERO);
    }

    @Override
    public QuirklDoubleNumber toDouble() {
        return new QuirklDoubleNumber(this.getValue() ? QuirklDoubleNumber.ONE : QuirklDoubleNumber.ZERO);
    }

    @Override
    public QuirklString toStr() throws QuirklCastException {
        return new QuirklString(this.getValue().toString());
    }

    @Override
    public QuirklFunction toFunction() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), TYPE.FUNCTION);
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toBoolean().getValue());
    }

    @Override
    public QuirklType<?> add(QuirklType<?> other) throws QuirklMathException {
        return null;
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException {
        return null;
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException {
        return null;
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        return null;
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException {
        return null;
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklMathException {
        return null;
    }

    @Override
    public QuirklType<?> root(QuirklType<?> other) throws QuirklMathException {
        return null;
    }

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        return null;
    }


}
