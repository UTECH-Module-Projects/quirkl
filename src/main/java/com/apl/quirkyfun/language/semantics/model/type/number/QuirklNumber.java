package com.apl.quirkyfun.language.semantics.model.type.number;

import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.model.type.QuirklString;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;
import lombok.Getter;

@Getter
public abstract class QuirklNumber<T extends Number> extends QuirklType<T> {

    protected QuirklNumber(T value) {
        super(value);
    }

    @Override
    public void checkIfCompatible(String op, QuirklType<?> other) throws QuirklOperationException {
        if (!other.isNumberType() || !other.isType(TYPE.STRING))
            throw QuirklOperationException.notCompatible(op, this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> castToBigger(Object result, QuirklType<?> other) throws QuirklCastException {
        return this.isSubtype(other) ? other.cast(result) : this.cast(result);
    }

    @Override
    public QuirklType<?> add(QuirklType<?> other) throws QuirklCastException, QuirklOperationException {
        return switch (other.getType()) {
            case VOID -> this.cast(this.value);
            case BOOLEAN -> this.cast((double) this.value + (double) ((QuirklBoolean) other).parseToNumber());
            case LONG_NUMBER, DOUBLE_NUMBER -> this.castToBigger((double) this.value + (double) other.getValue(), other);
            case STRING -> this.cast((double) this.value + (double) ((QuirklString) other).parseToNumber());
            default ->
                    throw QuirklOperationException.notCompatible("+", this.getType(), other.getType());
        };
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklCastException, QuirklOperationException {
        return switch (other.getType()) {
            case VOID -> this.cast(this.value);
            case BOOLEAN -> this.cast((double) this.value - (double) ((QuirklBoolean) other).parseToNumber());
            case LONG_NUMBER, DOUBLE_NUMBER -> this.castToBigger((double) this.value - (double) other.getValue(), other);
            case STRING -> this.cast((double) this.value - (double) ((QuirklString) other).parseToNumber());
            default ->
                    throw QuirklOperationException.notCompatible("-", this.getType(), other.getType());
        };
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklCastException, QuirklOperationException {
        return switch (other.getType()) {
            case VOID -> this.cast(0D);
            case BOOLEAN -> this.cast((double) this.value * (double) ((QuirklBoolean) other).parseToNumber());
            case LONG_NUMBER, DOUBLE_NUMBER -> this.castToBigger((double) this.value * (double) other.getValue(), other);
            case STRING -> this.cast((double) this.value * (double) ((QuirklString) other).parseToNumber());
            default ->
                    throw QuirklOperationException.notCompatible("*", this.getType(), other.getType());
        };
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        if ((other.isNumberType() && (double) other.getValue() == 0D) || other.isType(TYPE.VOID))
            throw QuirklMathException.divideByZero();

        double otherValue = switch (other.getType()) {
            case BOOLEAN -> (double) ((QuirklBoolean) other).parseToNumber();
            case LONG_NUMBER, DOUBLE_NUMBER -> (double) other.getValue();
            case STRING -> (double) ((QuirklString) other).parseToNumber();
            default -> throw QuirklOperationException.notCompatible("/", this.getType(), other.getType());
        };

        if (otherValue == 0D)
            throw QuirklMathException.divideByZero();

        double result = (double) this.value / otherValue;
        if (other.isType(TYPE.DOUBLE_NUMBER))
            return other.cast(result);
        return this.cast(result);
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklCastException, QuirklOperationException {
        if ((other.isNumberType() && (double) other.getValue() == 0D) || other.isType(TYPE.VOID))
            throw QuirklMathException.divideByZero();

        double otherValue = switch (other.getType()) {
            case BOOLEAN -> (double) ((QuirklBoolean) other).parseToNumber();
            case LONG_NUMBER, DOUBLE_NUMBER -> (double) other.getValue();
            case STRING -> (double) ((QuirklString) other).parseToNumber();
            default -> throw QuirklOperationException.notCompatible("%", this.getType(), other.getType());
        };

        if (otherValue == 0D)
            throw QuirklMathException.divideByZero();

        double result = (double) this.value % otherValue;
        if (other.isType(TYPE.DOUBLE_NUMBER))
            return other.cast(result);
        return this.cast(result);
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklCastException, QuirklOperationException {
        if ((double) this.getValue() == 0D)
        return switch (other.getType()) {
            case VOID -> this.cast(1D);
            case BOOLEAN -> this.cast((double) this.value * (double) ((QuirklBoolean) other).parseToNumber());
            case LONG_NUMBER, DOUBLE_NUMBER -> this.castToBigger((double) this.value * (double) other.getValue(), other);
            case STRING -> this.cast((double) this.value * (double) ((QuirklString) other).parseToNumber());
            default ->
                    throw QuirklOperationException.notCompatible("*", this.getType(), other.getType());
        };
    }

    @Override
    public QuirklNumber<?> root(QuirklNumber<?> other) throws QuirklMathException {
        if ((double) other.getValue() == 0d)
            throw new QuirklMathException("Cannot calculate the root of a number by 0");
        return new QuirklDoubleNumber(Math.pow((double) this.value, 1d / (double) other.getValue()));
    }
}
