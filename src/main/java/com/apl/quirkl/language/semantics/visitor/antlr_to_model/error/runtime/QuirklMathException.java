package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.type.QuirklType;

public class QuirklMathException extends QuirklRuntimeException {
    public QuirklMathException(String message) {
        super(message);
    }

    public static QuirklMathException divideByZero() {
        return new QuirklMathException("Cannot divide a number by zero.");
    }

    public static QuirklMathException modByZero() {
        return new QuirklMathException("Cannot perform modulus operation with zero.");
    }

    public static QuirklMathException zeroToNegativePower() {
        return new QuirklMathException("Cannot raise zero to a negative power.");
    }

    public static QuirklMathException zeroToZeroPower() {
        return new QuirklMathException("Cannot raise zero to the power of zero.");
    }

    public static QuirklMathException invalidRoot() {
        return new QuirklMathException("Cannot take the negative root of a number.");
    }

    public static QuirklMathException notComparable(QuirklType.TYPE type1, QuirklType.TYPE type2) {
        return new QuirklMathException(String.format("Cannot compare %s to %s.", type1, type2));
    }


}
