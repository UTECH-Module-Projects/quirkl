package com.apl.quirkl.language.semantics.model.type.number;

import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.semantics.model.type.*;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;
import lombok.Getter;

@Getter
public abstract class QuirklNum<T extends Number> extends QuirklType<T> {

    public QuirklNum(T value) {
        super(value);
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBool toBoolean() {
        return new QuirklBool(this.value.doubleValue() != 0);
    }

    @Override
    public QuirklLongNum toLong() {
        return new QuirklLongNum(this.value.longValue());
    }

    @Override
    public QuirklDoubleNum toDouble() {
        return new QuirklDoubleNum(this.value.doubleValue());
    }

    @Override
    public QuirklString toStr() {
        return new QuirklString(this.value.toString());
    }

    @Override
    public QuirklFunc toFunction() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), TYPE.FUNCTION);
    }

    @Override
    public QuirklType<?> add(QuirklType<?> other) throws QuirklOperationException {
        try {
            double result = this.toDouble().getValue() + other.toDouble().getValue();
            return this.castToBigger(result, other);
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.PLUS.toString(), this.getType(), other.getType());
        }
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklOperationException {
        try {
            double result = this.toDouble().getValue() - other.toDouble().getValue();
            return this.castToBigger(result, other);
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MINUS.toString(), this.getType(), other.getType());
        }
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklOperationException {
        try {
            double result = this.toDouble().getValue() * other.toDouble().getValue();
            return this.castToBigger(result, other);
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MULTIPLY.toString(), this.getType(), other.getType());
        }
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        try {
            double otherValue = other.toDouble().getValue();
            if (otherValue == 0)
                throw QuirklMathException.divideByZero();

            double result = this.toDouble().getValue() / otherValue;
            return this.castToBigger(result, other);
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.DIVIDE.toString(), this.getType(), other.getType());
        }
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException {
        try {
            double otherValue = other.toDouble().getValue();
            if (otherValue == 0)
                throw QuirklMathException.divideByZero();

            double result = this.toDouble().getValue() / otherValue;
            return this.castToBigger(result, other);
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MODULO.toString(), this.getType(), other.getType());
        }
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklMathException {
        try {
            double thisValue = this.toDouble().getValue();
            double otherValue = other.toDouble().getValue();
            if (thisValue == 0 && otherValue == 0)
                throw QuirklMathException.zeroToZeroPower();
            if (thisValue == 0 && otherValue < 0)
                throw QuirklMathException.zeroToNegativePower();

            double result = Math.pow(thisValue, otherValue);
            return this.castToBigger(result, other);
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.POWER.toString(), this.getType(), other.getType());
        }
    }

    @Override
    public QuirklType<?> root(QuirklType<?> other) throws QuirklMathException {
        try {
            double thisValue = this.toDouble().getValue();
            double otherValue = other.toDouble().getValue();
            if (otherValue <= 0)
                throw QuirklMathException.invalidRoot();

            double result = Math.pow(thisValue, 1 / otherValue);
            return this.castToBigger(result, other);
        } catch (QuirklCastException e) {
            throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.ROOT.toString(), this.getType(), other.getType());
        }
    }

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        double result = -this.toDouble().getValue();
        return this.cast(result);
    }
}
