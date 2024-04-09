package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType.TYPE;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.variable.Var;

public class QuirklFunctionException extends QuirklRuntimeException {

    public QuirklFunctionException(String message, String scope, QuirklCoord coord) {
        super(message, scope, coord);
    }

    public static QuirklFunctionException invalidReturnType(QuirklFuncValue func, TYPE resultType, String scope, QuirklCoord coord) {
        return new QuirklFunctionException(String.format("Cannot return %s as %s for anonymous function", resultType, func.getType()), scope, coord);
    }

    public static QuirklFunctionException invalidNumberOfArguments(QuirklFuncValue func, int expected, int actual, String scope, QuirklCoord coord) {
        return new QuirklFunctionException(String.format("Function %s expects %d arguments, but %d were provided", func.getIdDisplay(), expected, actual), scope, coord);
    }

    public static QuirklFunctionException incompatibleReturnTypes(QuirklFuncValue func1, QuirklFuncValue func2, String scope, QuirklCoord coord) {
        return new QuirklFunctionException(String.format("function %s return type %s not compatible with function %s return type %s", func1.getIdDisplay(), func1.getType(), func2.getIdDisplay(), func2.getType()), scope, coord);
    }

    public static QuirklFunctionException incompatibleParameter(QuirklFuncValue func1, QuirklFuncValue func2, String scope, QuirklCoord coord) {
        return new QuirklFunctionException(String.format("function %s of return type %s cannot return %s to function %s", func1.getIdDisplay(), func1.getType(), func2.getParameters().getFirst().getType(), func2.getIdDisplay()), scope, coord);
    }

    public static QuirklFunctionException returnButVoid(QuirklFuncValue func, String scope, QuirklCoord coord) {
        return new QuirklFunctionException(String.format("Function %s is void and cannot return a value", func.getIdDisplay()), scope, coord);
    }

    public static QuirklFunctionException noReturn(QuirklFuncValue func, String scope, QuirklCoord coord) {
        return new QuirklFunctionException(String.format("Function %s must return a value", func.getIdDisplay()), scope, coord);
    }

    public static QuirklFunctionException notAFunction(Var<?> var, String scope, QuirklCoord coord) {
        return new QuirklFunctionException(String.format("Variable %s is not a function", var.getId()), scope, coord);
    }

    public static QuirklFunctionException functionNotInitialized(Var<?> var, String scope, QuirklCoord coord) {
        return new QuirklFunctionException(String.format("Function %s is not initialized", var.getId()), scope, coord);
    }

}
