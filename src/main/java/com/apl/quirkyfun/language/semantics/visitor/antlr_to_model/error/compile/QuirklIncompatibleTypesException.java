package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;

public class QuirklIncompatibleTypesException extends QuirklTypeException {
    public QuirklIncompatibleTypesException(String message) {
        super(message);
    }

    public QuirklIncompatibleTypesException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklIncompatibleTypesException(Throwable cause) {
        super(cause);
    }

    protected QuirklIncompatibleTypesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static QuirklIncompatibleTypesException invalidReturnType(Function func, String resultType, QuirklCoordinate coordinate) {
        return new QuirklIncompatibleTypesException(String.format("Cannot return %s as %s for anonymous function %s", resultType, func.getType(), coordinate));
    }

    public static QuirklIncompatibleTypesException invalidReturnType(Variable func, String resultType, QuirklCoordinate coordinate) {
        return new QuirklIncompatibleTypesException(String.format("Cannot return %s as %s for function %s %s", resultType, func.getType(), func.getId(), coordinate));
    }
}
