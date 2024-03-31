package com.apl.quirkyfun.language.semantics.model.type;

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

    @Override
    public QuirklType<?> cast(Object value) {
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
    public QuirklVoid toVoid() throws QuirklCastException {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBoolean toBoolean() throws QuirklCastException {
        return null;
    }

    @Override
    public QuirklLongNumber toLong() throws QuirklCastException {
        return null;
    }

    @Override
    public QuirklDoubleNumber toDouble() throws QuirklCastException {
        return null;
    }

    @Override
    public QuirklString toStr() throws QuirklCastException {
        return null;
    }

    @Override
    public QuirklFunction toFunction() throws QuirklCastException {
        return null;
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return 0;
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


}
