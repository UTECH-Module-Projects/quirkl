package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklBool extends QuirklType<Boolean> {

    public static final QuirklBool TRUE = new QuirklBool(true);
    public static final QuirklBool FALSE = new QuirklBool(false);

    public QuirklBool() {
        super(false);
    }

    public QuirklBool(Boolean value) {
        super(value);
    }

    public QuirklBool(QuirklBool value) {
        super(value.getValue());
    }

    @Override
    public QuirklBool cast(Object value) throws QuirklCastException {
        String valueStr = value.toString().toLowerCase();
        if (value instanceof Double) return (Double) value == 0 ? FALSE : TRUE;
        if (value instanceof QuirklFuncValue) return valueStr.equals(QuirklFunc.EMPTY.toString()) ? FALSE : TRUE;
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
    public QuirklBool toBoolean() {
        return new QuirklBool(this);
    }

    @Override
    public QuirklLongNum toLong() {
        return new QuirklLongNum(this.getValue() ? QuirklLongNum.ONE : QuirklLongNum.ZERO);
    }

    @Override
    public QuirklDoubleNum toDouble() {
        return new QuirklDoubleNum(this.getValue() ? QuirklDoubleNum.ONE : QuirklDoubleNum.ZERO);
    }

    @Override
    public QuirklString toStr() throws QuirklCastException {
        return new QuirklString(this.getValue().toString());
    }

    @Override
    public QuirklFunc toFunction() throws QuirklCastException {
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
