package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklMathException extends QuirklRuntimeException {

    public QuirklMathException(String message, String scope) {
        super(message, scope);
    }

    public QuirklMathException(QuirklException e) {
        super(e);
    }

    public QuirklMathException(Throwable cause, String scope) {
        super(cause, scope);
    }

    public static QuirklMathException divideByZero(String scope) {
        return new QuirklMathException("Cannot divide a number by zero", scope);
    }

    public static QuirklMathException modByZero(String scope) {
        return new QuirklMathException("Cannot perform modulus operation with zero", scope);
    }

    public static QuirklMathException zeroToNegativePower(String scope) {
        return new QuirklMathException("Cannot raise zero to a negative power", scope);
    }

    public static QuirklMathException zeroToZeroPower(String scope) {
        return new QuirklMathException("Cannot raise zero to the power of zero", scope);
    }

    public static QuirklMathException rootOfNegativeNumber(String scope) {
        return new QuirklMathException("Cannot take the root of a negative number", scope);
    }

    public static QuirklMathException zeroRoot(String scope) {
        return new QuirklMathException("Root cannot be zero", scope);
    }

    public static QuirklMathException notComparable(QuirklType.TYPE type1, QuirklType.TYPE type2, String scope) {
        return new QuirklMathException(String.format("Cannot compare %s to %s", type1, type2), scope);
    }


}
