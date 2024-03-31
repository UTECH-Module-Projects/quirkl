package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.semantics.model.expression.operation.bool.NotBooleanExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.bool.TwoExpBooleanExpression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Getter
public abstract class QuirklType<T> {
    protected T value;
    private static final HashMap<String, TYPE> typeMap;
    private static final HashMap<TYPE, Integer> hierarchy;
    private static final List<TYPE> numberTypes;

    public static enum TYPE {
        VOID("QuirklVoid"), BOOLEAN("QuirklBoolean"), LONG_NUMBER("QuirklLongNumber"), DOUBLE_NUMBER("QuirklDoubleNumber"), STRING("QuirklString"), FUNCTION("QuirklFunction");
        private final String type;

        TYPE(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return this.type;
        }
    }

    static {
        numberTypes = List.of(TYPE.BOOLEAN, TYPE.LONG_NUMBER, TYPE.DOUBLE_NUMBER);
        hierarchy = new HashMap<>();
        hierarchy.put(TYPE.VOID, 0);
        hierarchy.put(TYPE.BOOLEAN, 1);
        hierarchy.put(TYPE.LONG_NUMBER, 2);
        hierarchy.put(TYPE.DOUBLE_NUMBER, 3);
        hierarchy.put(TYPE.STRING, 4);
        hierarchy.put(TYPE.FUNCTION, 5);

        typeMap = new HashMap<>();
        typeMap.put("void", TYPE.VOID);
        typeMap.put("bool", TYPE.BOOLEAN);
        typeMap.put("num", TYPE.LONG_NUMBER);
        typeMap.put("dec", TYPE.DOUBLE_NUMBER);
        typeMap.put("str", TYPE.STRING);
        typeMap.put("func", TYPE.FUNCTION);
    }

    protected QuirklType(T value) {
        this.value = value;
    }

    @SuppressWarnings("unchecked")
    public final void setValue(Object value) throws QuirklCastException {
        try {
            this.value = (T) value;
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value.toString(), this.getType());
        }
    }

    public final TYPE getType() {
        return TYPE.valueOf(this.getClass().getSimpleName());
    }

    public final boolean isType(TYPE type) {
        return this.getType().equals(type);
    }

    public final boolean isNumberType() {
        return isNumberType(this.getType());
    }

    public final boolean isNotNumberType() {
        return !isNumberType(this.getType());
    }

    public final boolean isSubtype(QuirklType<?> type) {
        return isSubtype(this.getType(), type.getType());
    }

    public final boolean isSameType(QuirklType<?> type) {
        return isSameType(this.getType(), type.getType());
    }

    public final QuirklType<?> castToBigger(Object value, QuirklType<?> other) throws QuirklCastException {
        return this.isSubtype(other) ? other.cast(value) : this.cast(value);
    }

    public static TYPE getTypeAsQuirklName(String type) {
        return typeMap.getOrDefault(type, null);
    }

    private static boolean isSubtype(TYPE type1, TYPE type2) {
        Integer hierarchy1 = hierarchy.get(type1);
        Integer hierarchy2 = hierarchy.get(type2);
        if (hierarchy1 == null || hierarchy2 == null) {
            return false;
        }
        return hierarchy1 <= hierarchy2;
    }

    private static boolean isSameType(TYPE type1, TYPE type2) {
        return type1.equals(type2);
    }

    private static boolean isNumberType(TYPE type) {
        return numberTypes.contains(type);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public final QuirklBoolean eq(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return new QuirklBoolean(thisValue.getValue().equals(otherValue.getValue()));
    }

    public final QuirklBoolean neq(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return new QuirklBoolean(!thisValue.getValue().equals(otherValue.getValue()));
    }

    public final QuirklBoolean gt(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return thisValue.compareTo(otherValue) > 0 ? QuirklBoolean.TRUE : QuirklBoolean.FALSE;
    }

    public final QuirklBoolean lt(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return thisValue.compareTo(otherValue) < 0 ? QuirklBoolean.TRUE : QuirklBoolean.FALSE;
    }

    public final QuirklBoolean gte(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return thisValue.compareTo(otherValue) >= 0 ? QuirklBoolean.TRUE : QuirklBoolean.FALSE;
    }

    public final QuirklBoolean lte(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return thisValue.compareTo(otherValue) <= 0 ? QuirklBoolean.TRUE : QuirklBoolean.FALSE;
    }

    public final QuirklBoolean and(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBoolean(this.toBoolean().getValue() && other.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBooleanExpression.OP.AND.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBoolean or(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBoolean(this.toBoolean().getValue() || other.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBooleanExpression.OP.OR.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBoolean xor(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBoolean(this.toBoolean().getValue() ^ other.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBooleanExpression.OP.XOR.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBoolean nand(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBoolean(!(this.toBoolean().getValue() && other.toBoolean().getValue()));
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBooleanExpression.OP.NAND.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBoolean nor(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBoolean(!(this.toBoolean().getValue() || other.toBoolean().getValue()));
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBooleanExpression.OP.NOR.toString(), this.getType(), other.getType());
        }

    }

    public final QuirklBoolean xnor(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBoolean(this.toBoolean().getValue() == other.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBooleanExpression.OP.XNOR.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBoolean not() throws QuirklMathException {
        try {
            return new QuirklBoolean(!this.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(NotBooleanExpression.NOT, this.getType());
        }
    }

    public abstract QuirklType<?> cast(Object value) throws QuirklCastException;

    public abstract QuirklVoid toVoid() throws QuirklCastException;

    public abstract QuirklBoolean toBoolean() throws QuirklCastException;

    public abstract QuirklLongNumber toLong() throws QuirklCastException;

    public abstract QuirklDoubleNumber toDouble() throws QuirklCastException;

    public abstract QuirklString toStr() throws QuirklCastException;

    public abstract QuirklFunction toFunction() throws QuirklCastException;

    public abstract int compareTo(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> add(QuirklType<?> other) throws QuirklMathException, QuirklFunctionException;

    public abstract QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> power(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> root(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> negate() throws QuirklMathException;
}