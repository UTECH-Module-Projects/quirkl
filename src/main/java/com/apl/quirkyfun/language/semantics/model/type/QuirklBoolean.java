package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklBoolean extends QuirklType<Boolean> {

    public static final QuirklBoolean TRUE = new QuirklBoolean(QuirklCoord.ORIGIN, true);
    public static final QuirklBoolean FALSE = new QuirklBoolean(QuirklCoord.ORIGIN, false);

    public QuirklBoolean() {
        super(QuirklCoord.ORIGIN, false);
    }

    public QuirklBoolean(QuirklCoord coord) {
        super(coord, false);
    }

    public QuirklBoolean(QuirklCoord coord, Boolean value) {
        super(coord, value);
    }

    public QuirklBoolean(QuirklBoolean value) {
        super(value.getCoord(), value.getValue());
    }

    @Override
    public QuirklBoolean cast(QuirklCoord coord, Object value) throws QuirklCastException {
        String valueStr = value.toString().toLowerCase();
        QuirklBoolean bool = new QuirklBoolean(this.getCoord());
        if (value instanceof Double) bool.setValue((Double) value == 0 ? FALSE : TRUE);
        if (value instanceof Function) bool.setValue(valueStr.equals(QuirklFunction.EMPTY.toString()) ? FALSE : TRUE);
        if (valueStr.isBlank()) bool.setValue(FALSE);
        bool.setValue(switch (valueStr) {
            case "false", "null", "0" -> FALSE;
            default -> TRUE;
        });
        return bool;
    }

    @Override
    public QuirklVoid toVoid() {
        return new QuirklVoid(this.getCoord());
    }

    @Override
    public QuirklBoolean toBoolean() {
        return new QuirklBoolean(this);
    }

    @Override
    public QuirklLongNumber toLong() throws QuirklCastException {
        return new QuirklLongNumber(this.getValue() ? QuirklLongNumber.ONE : QuirklLongNumber.ZERO);
    }

    @Override
    public QuirklDoubleNumber toDouble() throws QuirklCastException {
        return new QuirklDoubleNumber(this.getValue() ? QuirklDoubleNumber.ONE : QuirklDoubleNumber.ZERO);
    }

    @Override
    public QuirklString toStr() throws QuirklCastException {
        return new QuirklString(this.getCoord(), this.getValue().toString());
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

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        return null;
    }


}
