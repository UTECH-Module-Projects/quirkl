package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.lexer.QuirklLexer;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.FunctionCallExp;
import com.apl.quirkl.language.semantics.model.expression.VariableExp;
import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.function.FuncCallStmt;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.FuncBody;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.ReturnLambda;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToFunc;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;
import java.util.stream.Collectors;

public class QuirklFunc extends QuirklType<QuirklFuncValue> {

    public static final QuirklFunc EMPTY = new QuirklFunc();

    public QuirklFunc() {
        super(new QuirklFuncValue());
    }

    public QuirklFunc(QuirklFuncValue value) {
        super(value);
    }

    public int getTotParam() {
        return this.value.getParameters().size();
    }

    @Override
    public QuirklFunc cast(Object value) throws QuirklCastException {
        if (value instanceof QuirklFuncValue) return new QuirklFunc((QuirklFuncValue) value);
        String valueStr = value.toString();

        Prog tempProg = new Prog();

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(valueStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        AntlrToFunc antlrToFunc = new AntlrToFunc(tempProg);
        QuirklFuncValue quirklFuncValue = parser.function().accept(antlrToFunc);
        if (quirklFuncValue == null)
            throw QuirklCastException.notCompatible(valueStr, QuirklType.TYPE.FUNCTION);

        return new QuirklFunc(quirklFuncValue);
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBool toBoolean() {
        return new QuirklBool(!this.toString().equals(QuirklFunc.EMPTY.toString()));
    }

    @Override
    public QuirklLongNum toLong() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), QuirklType.TYPE.LONG_NUMBER);
    }

    @Override
    public QuirklDoubleNum toDouble() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), QuirklType.TYPE.DOUBLE_NUMBER);
    }

    @Override
    public QuirklString toStr() {
        return new QuirklString(this.value.toString());
    }

    @Override
    public QuirklFunc toFunction() throws QuirklCastException {
        return this.cast(this.value);
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        throw QuirklMathException.notComparable(this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> add(QuirklType<?> other) throws QuirklMathException, QuirklFunctionException {
        QuirklFuncValue thisQuirklFuncValue = this.value;
        if (other instanceof QuirklFunc otherFunction) {
            if (!thisQuirklFuncValue.getType().equals(otherFunction.getType()))
                throw QuirklFunctionException.incompatibleReturnTypes(thisQuirklFuncValue.getCoord(), thisQuirklFuncValue, otherFunction.getValue());

            QuirklFuncValue newFunc = new QuirklFuncValue();
            int otherFunctionSize = otherFunction.getValue().getParameters().size();
            if (otherFunctionSize > 1)
                throw QuirklFunctionException.tooManyArguments(newFunc.getCoord(), newFunc, otherFunctionSize, 1);

            QuirklList<Var<?>> newParameters = this.value.getParameters().stream().map(Var::clone).collect(Collectors.toCollection(QuirklList::new));
            newFunc.setParameters(newParameters);
            newFunc.setType(otherFunction.getType());

            QuirklList<Exp> varArguments = newParameters.stream().map(param -> new VariableExp(param.getCoord(), param.getScope(), param)).collect(Collectors.toCollection(QuirklList::new));

            if (otherFunctionSize == 0) {
                FuncBody functionBody = new FuncBody();
                functionBody.addStatement(new FuncCallStmt(this.getValue().getCoord(), this.getValue().getScope(), this, varArguments));
                if (otherFunction.getType().equals(QuirklType.TYPE.VOID)) {
                    functionBody.addStatement(new FuncCallStmt(this.getValue().getCoord(), this.getValue().getScope(), this, new QuirklList<>()));
                } else {
                    functionBody.setReturnExp(new FunctionCallExp(this.getValue().getCoord(), this.getValue().getScope(), otherFunction, new QuirklList<>()));
                }
            } else {
                FunctionCallExp smallFunctionCall = new FunctionCallExp(this.getValue().getCoord(), this.getValue().getScope(), this, varArguments);
                FunctionCallExp bigFunctionCall = new FunctionCallExp(this.getValue().getCoord(), this.getValue().getScope(), otherFunction,List.of(smallFunctionCall));
                ReturnLambda returnLambda = new ReturnLambda(bigFunctionCall);

                newFunc.setBody(returnLambda);
            }
            return new QuirklFunc(newFunc);
        } else return this.add(other.toFunction());
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MINUS.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MULTIPLY.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.DIVIDE.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MODULO.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.POWER.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> root(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.ROOT.toString(), this.getType(), other.getType());
    }

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MINUS.toString(), this.getType());
    }

    public QuirklType<?> call(QuirklType<?>... args) throws QuirklRuntimeException {
        return this.value.apply(args);
    }
}
