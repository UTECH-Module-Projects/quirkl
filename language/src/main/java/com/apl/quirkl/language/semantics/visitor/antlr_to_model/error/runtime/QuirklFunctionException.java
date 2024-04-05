package com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;

public class QuirklFunctionException extends QuirklRuntimeException {

    public QuirklFunctionException(String message, String scope) {
        super(message, scope);
    }

    public QuirklFunctionException(QuirklException e) {
        super(e);
    }

    public QuirklFunctionException(Throwable cause, String scope) {
        super(cause, scope);
    }
    public static QuirklFunctionException invalidReturnType(QuirklFuncValue func, QuirklType.TYPE resultType, String scope) {
        return new QuirklFunctionException(String.format("Cannot return %s as %s for anonymous function", resultType, func.getType()), scope);
    }

    public static QuirklFunctionException invalidNumberOfArguments(QuirklFuncValue func, int expected, int actual, String scope) {
        return new QuirklFunctionException(String.format("Function %s expects %d arguments, but %d were provided", func.getId(), expected, actual), scope);
    }

    public static QuirklFunctionException incompatibleReturnTypes(QuirklFuncValue func1, QuirklFuncValue func2, String scope) {
        return new QuirklFunctionException(String.format("function %s return type %s not compatible with function %s return type %s", func1.getId(), func1.getType(), func2.getId(), func2.getType()), scope);
    }

    public static QuirklFunctionException tooManyArguments(QuirklFuncValue func, int expected, int actual, String scope) {
        return new QuirklFunctionException(String.format("Function %s expects %d arguments, but %d were provided", func.getId(), expected, actual), scope);
    }

    public static QuirklFunctionException incompatibleParameter(QuirklCoord coord, QuirklFuncValue func1, QuirklFuncValue func2, String scope) {
        return new QuirklFunctionException(String.format("function %s of return type %s cannot return %s to function %s", func1.getId(), func1.getType(), func2.getParameters().getFirst().getType(), func2.getId()), scope);
    }

    public static QuirklFunctionException returnButVoid(QuirklCoord coord, QuirklFuncValue func, String scope) {
        return new QuirklFunctionException(String.format("Function %s is void and cannot return a value", func.getId()), scope);
    }

    public static QuirklFunctionException noReturn(QuirklCoord coord, QuirklFuncValue func, String scope) {
        return new QuirklFunctionException(String.format("Function %s must return a value", func.getId()), scope);
    }

    public static QuirklFunctionException notAFunction(QuirklCoord coord, Var<?> var, String scope) {
        return new QuirklFunctionException(String.format("Variable %s is not a function", var.getId()), scope);
    }

    public static QuirklFunctionException functionNotInitialized(QuirklCoord coord, Var<?> var, String scope) {
        return new QuirklFunctionException(String.format("Function %s is not initialized", var.getId()), scope);
    }

}
