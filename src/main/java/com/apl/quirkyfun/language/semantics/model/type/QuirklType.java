package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.model.variable.function.end_function.FunctionBody;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public abstract class QuirklType<T> {
    protected final T value;
    private static final HashMap<String, TYPE> typeMap;
    private static final HashMap<TYPE, Map.Entry<Integer, QuirklType<?>>> hierarchy;
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
        numberTypes = List.of(TYPE.LONG_NUMBER, TYPE.DOUBLE_NUMBER);
        hierarchy = new HashMap<>();
        hierarchy.put(TYPE.VOID, Map.entry(0, new QuirklVoid()));
        hierarchy.put(TYPE.BOOLEAN, Map.entry(1, new QuirklBoolean(false)));
        hierarchy.put(TYPE.LONG_NUMBER, Map.entry(2, new QuirklLongNumber(0L)));
        hierarchy.put(TYPE.DOUBLE_NUMBER, Map.entry(3, new QuirklDoubleNumber(0D)));
        hierarchy.put(TYPE.STRING, Map.entry(4, new QuirklString("")));
        hierarchy.put(TYPE.FUNCTION, Map.entry(5, new QuirklFunction(new Function(new QuirklList<>(), "QuirklVoid", new FunctionBody()))));

        typeMap = new HashMap<>();
        typeMap.put("void", TYPE.VOID);
        typeMap.put("bool", TYPE.BOOLEAN);
        typeMap.put("num", TYPE.LONG_NUMBER);
        typeMap.put("dec", TYPE.DOUBLE_NUMBER);
        typeMap.put("str", TYPE.STRING);
        typeMap.put("func", TYPE.FUNCTION);
    }

    @SuppressWarnings("unchecked")
    protected QuirklType() {
        this.value = (T) this.getDefaultValue().getValue();
    }

    protected QuirklType(T value) {
        this.value = value;
    }

    public TYPE getType() {
        return TYPE.valueOf(this.getClass().getSimpleName());
    }

    public boolean isType(TYPE type) {
        return this.getType().equals(type);
    }

    public QuirklType<?> getDefaultValue() {
        var result = hierarchy.getOrDefault(this.getType(), null);
        if (result == null) {
            return null;
        }
        return result.getValue();
    }

    public boolean isNumberType() {
        return isNumberType(this.getType());
    }

    public boolean isSubtype(QuirklType<?> type) {
        return isSubtype(this.getType(), type.getType());
    }

    public boolean isSubtype(String type) {
        return isSubtype(this.getType(), type);
    }

    public boolean isMathCompatible(QuirklType<?> type) {
        return isMathCompatible(this.getType(), type.getType());
    }

    public boolean isMathCompatible(String type) {
        return isMathCompatible(this.getType(), type);
    }

    private static boolean isSubtype(TYPE type1, TYPE type2) {
        Integer hierarchy1 = hierarchy.get(type1).getKey();
        Integer hierarchy2 = hierarchy.get(type2).getKey();
        if (hierarchy1 == null || hierarchy2 == null) {
            return false;
        }
        return hierarchy1 <= hierarchy2;
    }

    private static boolean isNumberType(TYPE type) {
        return numberTypes.contains(type);
    }

    private static boolean isMathCompatible(TYPE type1, TYPE type2) {
        return isNumberType(type1) && isNumberType(type2);
    }

    public static TYPE getTypeAsQuirklName(String type) {
        return typeMap.getOrDefault(type, null);
    }

    public abstract QuirklType<?> add(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> power(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> root(QuirklType<?> other) throws QuirklMathException;

    public abstract QuirklType<?> cast(Object value) throws QuirklCastException;

    public abstract QuirklType<?> castToBigger(Object value, QuirklType<?> other) throws QuirklCastException;

    public abstract void checkIfCompatible(String op, QuirklType<?> other) throws QuirklOperationException;


}