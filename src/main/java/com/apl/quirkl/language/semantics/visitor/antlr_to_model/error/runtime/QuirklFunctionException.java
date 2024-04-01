package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.variable.Var;

public class QuirklFunctionException extends QuirklRuntimeException {
    public QuirklFunctionException(String message) {
        super(message);
    }

    private static QuirklFunctionException newInstance(String message, QuirklCoord coord) {
        return new QuirklFunctionException(message + getCoord(coord));
    }

    public static QuirklFunctionException invalidReturnType(QuirklCoord coord, QuirklFuncValue func, QuirklType.TYPE resultType) {
        String msg = String.format("Cannot return %s as %s for anonymous function", resultType, func.getType());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException invalidNumberOfArguments(QuirklCoord coord, QuirklFuncValue func, int expected, int actual) {
        String msg = String.format("Function %s expects %d arguments, but %d were provided", func.getId(), expected, actual);
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException incompatibleReturnTypes(QuirklCoord coord, QuirklFuncValue func1, QuirklFuncValue func2) {
        String msg = String.format("function %s return type %s not compatible with function %s return type %s", func1.getId(), func1.getType(), func2.getId(), func2.getType());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException tooManyArguments(QuirklCoord coord, QuirklFuncValue func, int expected, int actual) {
        String msg = String.format("Function %s expects %d arguments, but %d were provided", func.getId(), expected, actual);
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException incompatibleParameter(QuirklCoord coord, QuirklFuncValue func1, QuirklFuncValue func2) {
        String msg = String.format("function %s of return type %s cannot return %s to function %s", func1.getId(), func1.getType(), func2.getParameters().getFirst().getType(), func2.getId());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException returnButVoid(QuirklCoord coord, QuirklFuncValue func) {
        String msg = String.format("Function %s is void and cannot return a value", func.getId());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException noReturn(QuirklCoord coord, QuirklFuncValue func) {
        String msg = String.format("Function %s must return a value", func.getId());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException notAFunction(QuirklCoord coord, Var<?> var) {
        String msg = String.format("Variable %s is not a function", var.getId());
        return newInstance(msg, coord);
    }

    public static QuirklFunctionException functionNotInitialized(QuirklCoord coord, Var<?> var) {
        String msg = String.format("Function %s is not initialized", var.getId());
        return newInstance(msg, coord);
    }

}
