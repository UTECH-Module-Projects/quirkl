package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklMathException extends QuirklRuntimeException {

    public QuirklMathException(String message, String scope, QuirklCoord coord) {
        super(message, scope, coord);
    }

    public QuirklMathException(QuirklException e) {
        super(e);
    }

    public QuirklMathException(Throwable cause, String scope, QuirklCoord coord) {
        super(cause, scope, coord);
    }

    public static QuirklMathException divideByZero(String scope, QuirklCoord coord) {
        return new QuirklMathException("Cannot divide a number by zero", scope, coord);
    }

    public static QuirklMathException modByZero(String scope, QuirklCoord coord) {
        return new QuirklMathException("Cannot perform modulus operation with zero", scope, coord);
    }

    public static QuirklMathException zeroToNegativePower(String scope, QuirklCoord coord) {
        return new QuirklMathException("Cannot raise zero to a negative power", scope, coord);
    }

    public static QuirklMathException zeroToZeroPower(String scope, QuirklCoord coord) {
        return new QuirklMathException("Cannot raise zero to the power of zero", scope, coord);
    }

    public static QuirklMathException rootOfNegativeNumber(String scope, QuirklCoord coord) {
        return new QuirklMathException("Cannot take the root of a negative number", scope, coord);
    }

    public static QuirklMathException zeroRoot(String scope, QuirklCoord coord) {
        return new QuirklMathException("Root cannot be zero", scope, coord);
    }

    public static QuirklMathException notComparable(QuirklType.TYPE type1, QuirklType.TYPE type2, String scope, QuirklCoord coord) {
        return new QuirklMathException(String.format("Cannot compare %s to %s", type1, type2), scope, coord);
    }


}
