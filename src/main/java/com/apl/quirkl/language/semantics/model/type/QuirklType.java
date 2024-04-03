package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.semantics.model.expression.operation.bool.NotBoolExp;
import com.apl.quirkl.language.semantics.model.expression.operation.bool.TwoExpBoolExp;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Getter
public abstract class QuirklType<T> {
    protected T value;
    private static final HashMap<String, TYPE> typeMap;
    private static final HashMap<TYPE, Integer> hierarchy;
    private static final List<TYPE> numberTypes;
    private static final HashMap<TYPE, String> typeSimpleMap;

    public enum TYPE {
        VOID("QuirklVoid"), BOOLEAN("QuirklBool"), LONG_NUMBER("QuirklLongNum"), DOUBLE_NUMBER("QuirklDoubleNum"), STRING("QuirklString"), FUNCTION("QuirklFunc"), ERROR("QuirklError");
        private final String type;

        TYPE(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return this.type;
        }

        public String getSimpleType() {
            return typeSimpleMap.get(this);
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
        hierarchy.put(TYPE.ERROR, 6);

        typeMap = new HashMap<>();
        typeMap.put("void", TYPE.VOID);
        typeMap.put("bool", TYPE.BOOLEAN);
        typeMap.put("num", TYPE.LONG_NUMBER);
        typeMap.put("dec", TYPE.DOUBLE_NUMBER);
        typeMap.put("str", TYPE.STRING);
        typeMap.put("func", TYPE.FUNCTION);
        typeMap.put("err", TYPE.ERROR);

        typeSimpleMap = new HashMap<>();
        typeSimpleMap.put(TYPE.VOID, "void");
        typeSimpleMap.put(TYPE.BOOLEAN, "bool");
        typeSimpleMap.put(TYPE.LONG_NUMBER, "num");
        typeSimpleMap.put(TYPE.DOUBLE_NUMBER, "dec");
        typeSimpleMap.put(TYPE.STRING, "str");
        typeSimpleMap.put(TYPE.FUNCTION, "func");
        typeSimpleMap.put(TYPE.ERROR, "err");
    }

    public QuirklType(T value) {
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

    public final void setValue(QuirklType<T> value) throws QuirklCastException {
        try {
            this.value = value.getValue();
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value.getValue().toString(), this.getType());
        }
    }

    public final TYPE getType() {
        String value = this.getClass().getSimpleName();
        for(TYPE e: TYPE.values()) {
            if(e.toString().equals(value)) {
                return e;
            }
        }
        return null;
    }

    public final boolean isType(TYPE type) {
        TYPE thisType = this.getType();
        if (thisType == null)
            return false;
        return thisType.equals(type);
    }

    public final boolean isNotNumberType() {
        return !isNumberType(this.getType());
    }

    public final boolean isSubtype(QuirklType<?> type) {
        return isSubtype(this.getType(), type.getType());
    }

    public final QuirklType<?> castToBigger(Object value, QuirklType<?> other) throws QuirklCastException {
        return this.isSubtype(other) ? other.cast(value) : this.cast(value);
    }

    public static TYPE toQuirklType(String type) {
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

    private static boolean isNumberType(TYPE type) {
        return numberTypes.contains(type);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuirklType<?> that)) return false;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public final QuirklBool eq(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return new QuirklBool(thisValue.getValue().equals(otherValue.getValue()));
    }

    public final QuirklBool neq(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return new QuirklBool(!thisValue.getValue().equals(otherValue.getValue()));
    }

    public final QuirklBool gt(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return thisValue.compareTo(otherValue) > 0 ? QuirklBool.TRUE : QuirklBool.FALSE;
    }

    public final QuirklBool lt(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return thisValue.compareTo(otherValue) < 0 ? QuirklBool.TRUE : QuirklBool.FALSE;
    }

    public final QuirklBool gte(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return thisValue.compareTo(otherValue) >= 0 ? QuirklBool.TRUE : QuirklBool.FALSE;
    }

    public final QuirklBool lte(QuirklType<?> other) throws QuirklMathException {
        QuirklType<?> thisValue = this.castToBigger(this.value, other);
        QuirklType<?> otherValue = other.castToBigger(other.value, this);
        return thisValue.compareTo(otherValue) <= 0 ? QuirklBool.TRUE : QuirklBool.FALSE;
    }

    public final QuirklBool and(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBool(this.toBoolean().getValue() && other.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBoolExp.OP.AND.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBool or(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBool(this.toBoolean().getValue() || other.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBoolExp.OP.OR.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBool xor(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBool(this.toBoolean().getValue() ^ other.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBoolExp.OP.XOR.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBool nand(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBool(!(this.toBoolean().getValue() && other.toBoolean().getValue()));
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBoolExp.OP.NAND.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBool nor(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBool(!(this.toBoolean().getValue() || other.toBoolean().getValue()));
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBoolExp.OP.NOR.toString(), this.getType(), other.getType());
        }

    }

    public final QuirklBool xnor(QuirklType<?> other) throws QuirklMathException {
        try {
            return new QuirklBool(this.toBoolean().getValue() == other.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpBoolExp.OP.XNOR.toString(), this.getType(), other.getType());
        }
    }

    public final QuirklBool not() throws QuirklMathException {
        try {
            return new QuirklBool(!this.toBoolean().getValue());
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(NotBoolExp.NOT, this.getType());
        }
    }

    public abstract QuirklType<?> cast(Object value) throws QuirklCastException;

    public abstract QuirklVoid toVoid() throws QuirklCastException;

    public abstract QuirklBool toBoolean() throws QuirklCastException;

    public abstract QuirklLongNum toLong() throws QuirklCastException;

    public abstract QuirklDoubleNum toDouble() throws QuirklCastException;

    public abstract QuirklString toStr() throws QuirklCastException;

    public abstract QuirklFunc toFunction() throws QuirklCastException;

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