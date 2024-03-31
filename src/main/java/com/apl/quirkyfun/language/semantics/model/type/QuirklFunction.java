package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.lexer.QuirklLexer;
import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.FunctionCallExpression;
import com.apl.quirkyfun.language.semantics.model.expression.VariableExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.TwoExpOperationExpression;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.statement.FunctionCallStatement;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.model.variable.function.end_function.FunctionBody;
import com.apl.quirkyfun.language.semantics.model.variable.function.end_function.ReturnLambda;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.AntlrToFunction;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;
import java.util.stream.Collectors;

public class QuirklFunction extends QuirklType<Function> {

    public static final QuirklFunction EMPTY = new QuirklFunction();

    public QuirklFunction() {
        super(new Function());
    }

    public QuirklFunction(Function func) {
        super(func);
    }

    @Override
    public QuirklFunction cast(Object value) throws QuirklCastException {
        if (value instanceof Function) return new QuirklFunction((Function) value);
        String valueStr = value.toString();

        Program tempProgram = new Program();

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(valueStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        AntlrToFunction antlrToFunction = new AntlrToFunction(tempProgram);
        Function function = parser.function().accept(antlrToFunction);
        if (function == null)
            throw QuirklCastException.notCompatible(valueStr, QuirklType.TYPE.FUNCTION);

        return new QuirklFunction(function);
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBoolean toBoolean() {
        return new QuirklBoolean(!this.toString().equals(QuirklFunction.EMPTY.toString()));
    }

    @Override
    public QuirklLongNumber toLong() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), QuirklType.TYPE.LONG_NUMBER);
    }

    @Override
    public QuirklDoubleNumber toDouble() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), QuirklType.TYPE.DOUBLE_NUMBER);
    }

    @Override
    public QuirklString toStr() {
        return new QuirklString(this.value.toString());
    }

    @Override
    public QuirklFunction toFunction() throws QuirklCastException {
        return this.cast(this.value);
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        throw QuirklMathException.notComparable(this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> add(QuirklType<?> other) throws QuirklMathException, QuirklFunctionException {
        Function thisFunction = this.value;
        if (other instanceof QuirklFunction otherFunction) {
            if (!thisFunction.getType().equals(otherFunction.getType()))
                throw QuirklFunctionException.incompatibleReturnTypes(thisFunction.getCoord(), thisFunction, otherFunction.getValue());

            Function newFunc = new Function();
            int otherFunctionSize = otherFunction.getValue().getParameters().size();
            if (otherFunctionSize > 1)
                throw QuirklFunctionException.tooManyArguments(newFunc.getCoord(), newFunc, otherFunctionSize, 1);

            QuirklList<Variable> newParameters = this.value.getParameters().stream().map(Variable::clone).collect(Collectors.toCollection(QuirklList::new));
            newFunc.setParameters(newParameters);
            newFunc.setType(otherFunction.getType());

            QuirklList<Expression> varArguments = newParameters.stream().map(param -> new VariableExpression(param.getCoord(), param)).collect(Collectors.toCollection(QuirklList::new));

            if (otherFunctionSize == 0) {
                FunctionBody functionBody = new FunctionBody();
                functionBody.addStatement(new FunctionCallStatement(this, varArguments));
                if (otherFunction.getType().equals(QuirklType.TYPE.VOID)) {
                    functionBody.addStatement(new FunctionCallStatement(this, new QuirklList<>()));
                } else {
                    functionBody.setReturnExpression(new FunctionCallExpression(this.value.getCoord(), otherFunction, new QuirklList<>()));
                }
            } else {
                FunctionCallExpression smallFunctionCall = new FunctionCallExpression(this.value.getCoord(), this, varArguments);
                FunctionCallExpression bigFunctionCall = new FunctionCallExpression(this.value.getCoord(), otherFunction,List.of(smallFunctionCall));
                ReturnLambda returnLambda = new ReturnLambda(bigFunctionCall);

                newFunc.setBody(returnLambda);
            }
            return new QuirklFunction(newFunc);
        } else return this.add(other.toFunction());
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOperationExpression.OP.MINUS.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOperationExpression.OP.MULTIPLY.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOperationExpression.OP.DIVIDE.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOperationExpression.OP.MODULO.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOperationExpression.OP.POWER.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> root(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOperationExpression.OP.ROOT.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOperationExpression.OP.MINUS.toString(), this.getType());
    }

    public QuirklType<?> call(QuirklType<?>... args) throws QuirklRuntimeException {
        return this.value.apply(args);
    }
}
