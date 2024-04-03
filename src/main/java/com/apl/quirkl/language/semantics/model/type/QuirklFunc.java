package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.lexer.QuirklLexer;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.FunctionCallExp;
import com.apl.quirkl.language.semantics.model.expression.VariableExp;
import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.FuncCallStmt;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.FuncBody;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToVar;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;
import java.util.stream.Collectors;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.isEmpty;


public class QuirklFunc extends QuirklType<QuirklFuncValue> {

    public static final QuirklFunc EMPTY = new QuirklFunc();

    public QuirklFunc() {
        super(new QuirklFuncValue());
    }

    public QuirklFunc(QuirklFuncValue value) {
        super(value);
    }

    @Override
    public QuirklFunc cast(Object value) throws QuirklCastException {
        if (value instanceof QuirklFuncValue) return new QuirklFunc((QuirklFuncValue) value);
        String valueStr = value.toString();

        Prog tempProg = new Prog();

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(valueStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        AntlrToVar antlrToVar = new AntlrToVar(tempProg, this.getValue().getScope());
        Var<QuirklFunc> varFunc = antlrToVar.visitFunction(parser.function());
        if (isEmpty(varFunc))
            throw QuirklCastException.notCompatible(valueStr, QuirklType.TYPE.FUNCTION);

        QuirklFuncValue quirklFuncValue = varFunc.getValue().getValue();
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
        //Get This Function Value
        QuirklFuncValue thisFuncValue = this.value;

        //Check if Other is Function
        if (other instanceof QuirklFunc otherFunction) {
            //Check if Return Types are Compatible
            if (!thisFuncValue.getType().equals(otherFunction.getType()))
                throw QuirklFunctionException.incompatibleReturnTypes(thisFuncValue.getCoord(), thisFuncValue, otherFunction.getValue());

            //Create Temp Program and Scope
            QuirklCoord tempCoord = this.getValue().getCoord();
            String tempScope = this.getValue().getScope();

            int otherFunctionSize = otherFunction.getValue().getParameters().size();
            if (otherFunctionSize > 1)
                throw QuirklFunctionException.tooManyArguments(tempCoord, this.getValue(), otherFunctionSize, 1);

            QuirklFuncValue newFunc = new QuirklFuncValue(tempCoord, tempScope, null, this.getValue().getType(), true);

            QuirklList<Var<?>> newParameters = this.value.getParameters().stream().map(Var::clone).collect(Collectors.toCollection(QuirklList::new));

            QuirklList<Exp> varArguments = newParameters.stream().map(param -> new VariableExp(param.getCoord(), param.getScope(), param)).collect(Collectors.toCollection(QuirklList::new));

            if (otherFunctionSize == 0) {
                FuncBody functionBody = newFunc.getBody();
                functionBody.addStatement(new FuncCallStmt(tempCoord, tempScope, new Var<>(tempCoord, tempScope, TYPE.FUNCTION, "anonymous", new QuirklFunc(newFunc)), varArguments));
                if (otherFunction.getType().equals(QuirklType.TYPE.VOID)) {
                    functionBody.addStatement(new FuncCallStmt(tempCoord, tempScope, new Var<>(tempCoord, tempScope, TYPE.FUNCTION, "anonymous", new QuirklFunc(newFunc)), new QuirklList<>()));
                } else {
                    functionBody.setReturnExp(new FunctionCallExp(tempCoord, tempScope, new Var<>(tempCoord, tempScope, TYPE.FUNCTION, "anonymous", otherFunction), new QuirklList<>()));
                }
            } else {
                FunctionCallExp smallFunctionCall = new FunctionCallExp(tempCoord, tempScope, new Var<>(tempCoord, tempScope, TYPE.FUNCTION, "anonymous", this), varArguments);
                FunctionCallExp bigFunctionCall = new FunctionCallExp(tempCoord, tempScope, new Var<>(tempCoord, tempScope, TYPE.FUNCTION, "anonymous", otherFunction), new QuirklList<>(List.of(smallFunctionCall)));
                newFunc.getBody().setReturnExp(bigFunctionCall);
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
