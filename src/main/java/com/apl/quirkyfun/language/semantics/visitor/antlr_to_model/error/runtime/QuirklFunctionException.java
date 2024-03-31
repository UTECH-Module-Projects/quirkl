package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;

public class QuirklFunctionException extends QuirklTypeException {
    public QuirklFunctionException(String message) {
        super(message);
    }

    public QuirklFunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklFunctionException(Throwable cause) {
        super(cause);
    }

    protected QuirklFunctionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    private static QuirklFunctionException newInstance(String message, QuirklCoord coord) {
        return new QuirklFunctionException(message + getCoord(coord));
    }

    public static QuirklFunctionException invalidReturnType(QuirklCoord coord, Function func, QuirklType.TYPE resultType) {
        String msg = String.format("Cannot return %s as %s for anonymous function", resultType, func.getType());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException invalidNumberOfArguments(QuirklCoord coord, Function func, int expected, int actual) {
        String msg = String.format("Function %s expects %d arguments, but %d were provided", func.getId(), expected, actual);
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException incompatibleReturnTypes(QuirklCoord coord, Function func1, Function func2) {
        String msg = String.format("function %s return type %s not compatible with function %s return type %s", func1.getId(), func1.getType(), func2.getId(), func2.getType());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException tooManyArguments(QuirklCoord coord, Function func, int expected, int actual) {
        String msg = String.format("Function %s expects %d arguments, but %d were provided", func.getId(), expected, actual);
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException incompatibleParameter(QuirklCoord coord, Function func1, Function func2) {
        String msg = String.format("function %s of return type %s cannot return %s to function %s", func1.getId(), func1.getType(), func2.getParameters().getFirst().getType(), func2.getId());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException returnButVoid(QuirklCoord coord, Function func) {
        String msg = String.format("Function %s is void and cannot return a value", func.getId());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException noReturn(QuirklCoord coord, Function func) {
        String msg = String.format("Function %s must return a value", func.getId());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException notAFunction(QuirklCoord coord, Variable var) {
        String msg = String.format("Variable %s is not a function", var.getId());
        return newInstance(msg, coord);
    }

}
