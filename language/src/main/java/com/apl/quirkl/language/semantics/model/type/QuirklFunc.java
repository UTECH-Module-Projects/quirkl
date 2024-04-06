package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.lexer.QuirklLexer;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.FunctionCallExp;
import com.apl.quirkl.language.semantics.model.expression.VarExp;
import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.FuncCallStmt;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.FuncBody;
import com.apl.quirkl.language.semantics.visitor.QuirklErrorListener;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToVar;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.isEmpty;


public class QuirklFunc extends QuirklType<QuirklFuncValue> {

    public static final QuirklFunc EMPTY = new QuirklFunc();

    public QuirklFunc() {
        super(new QuirklFuncValue(), Prog.INSTANCE);
    }

    public QuirklFunc(QuirklFuncValue value, ProgTerm term) {
        super(value, term);
    }

    public static QuirklFunc cast(Object value, ProgTerm term) throws QuirklCastException {
        if (value instanceof QuirklFuncValue) return new QuirklFunc((QuirklFuncValue) value, term);
        String valueStr = value.toString();

        QuirklLexer lexer = new QuirklLexer(CharStreams.fromString(valueStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuirklParser parser = new QuirklParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new QuirklErrorListener());

        AntlrToVar antlrToVar = new AntlrToVar(term.getScope());
        Var<QuirklFunc> varFunc = antlrToVar.visitFunction(parser.function());

        if (isEmpty(varFunc))
            throw QuirklCastException.notCompatible(valueStr, QuirklType.TYPE.FUNCTION, term.getMyScope(), term.getCoord());

        QuirklFuncValue quirklFuncValue = varFunc.getValue().getValue();
        return new QuirklFunc(quirklFuncValue, term);
    }

    @Override
    public QuirklFunc cast(Object value) throws QuirklCastException {
        return cast(value, this.getTerm());
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBool toBoolean() {
        return new QuirklBool(!this.toString().equals(QuirklFunc.EMPTY.toString()), this.getTerm());
    }

    @Override
    public QuirklLongNum toLong() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), QuirklType.TYPE.LONG_NUMBER, this.getScope(), this.getCoord());
    }

    @Override
    public QuirklDoubleNum toDouble() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), QuirklType.TYPE.DOUBLE_NUMBER, this.getScope(), this.getCoord());
    }

    @Override
    public QuirklString toStr() {
        return new QuirklString(this.value.toString(), this.getTerm());
    }

    @Override
    public QuirklFunc toFunction() throws QuirklCastException {
        return this.cast(this.value);
    }

    @Override
    public QuirklErr toError() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), TYPE.ERROR, this.getScope(), this.getCoord());
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        throw QuirklMathException.notComparable(this.getType(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    @SuppressWarnings("unchecked")
    public QuirklType<?> add(QuirklType<?> other) throws QuirklMathException, QuirklFunctionException {
        //Get This Function Value
        QuirklFuncValue thisFuncValue = this.value;

        //Check if Other is Function
        if (other instanceof QuirklFunc otherFunc) {
            QuirklFuncValue otherFuncValue = otherFunc.getValue();

            //Check if Return Types are Compatible
            if (!otherFuncValue.getParameters().isEmpty() && !thisFuncValue.getType().equals(otherFuncValue.getParameters().getFirst().getType()))
                throw QuirklFunctionException.incompatibleParameter(thisFuncValue, otherFuncValue, this.getScope(), this.getCoord());

            //Create Temp Program and Scope
            QuirklCoord tempCoord = this.getValue().getCoord();
            String tempScope = this.getValue().getScope();

            int otherFunctionSize = otherFuncValue.getParameters().size();
            if (otherFunctionSize > 1)
                throw QuirklFunctionException.invalidNumberOfArguments(this.getValue(), otherFunctionSize, 1, this.getScope(), this.getCoord());

            QuirklFuncValue newFunc = new QuirklFuncValue(this.getTerm().getCoord(), this.getTerm().getScope(), null, otherFuncValue.getType(), true);

            QuirklList<Exp> varArguments = this.value.getParameters().stream().map(param -> new VarExp(param.getCoord(), param.getScope(), param)).collect(Collectors.toCollection(QuirklList::new));
            newFunc.setParameters(this.value.getParameters());

            Var<QuirklFunc> thisVarFunc = (Var<QuirklFunc>) Prog.INSTANCE.getVarAllScope(thisFuncValue.getId(), thisFuncValue.getScope());
            Var<QuirklFunc> otherVarFunc = (Var<QuirklFunc>) Prog.INSTANCE.getVarAllScope(otherFuncValue.getId(), otherFuncValue.getScope());

            System.out.println(thisVarFunc);
            System.out.println(otherVarFunc + ": " + otherFuncValue.getId() + ", " + otherFuncValue.getScope() + "\n\n");




            if (otherFunctionSize == 0) {
                FuncBody functionBody = newFunc.getBody();
                functionBody.addStatement(new FuncCallStmt(tempCoord, tempScope, thisVarFunc, varArguments));
                if (Objects.equals(otherFuncValue.getType(), TYPE.VOID)) {
                    functionBody.addStatement(new FuncCallStmt(tempCoord, tempScope, otherVarFunc, new QuirklList<>()));
                } else {
                    functionBody.setReturnExp(new FunctionCallExp(tempCoord, tempScope, otherVarFunc, new QuirklList<>()));
                }
            } else {
                FunctionCallExp smallFunctionCall = new FunctionCallExp(tempCoord, tempScope, thisVarFunc, varArguments);
                FunctionCallExp bigFunctionCall = new FunctionCallExp(tempCoord, tempScope, otherVarFunc, new QuirklList<>(List.of(smallFunctionCall)));
                newFunc.getBody().setReturnExp(bigFunctionCall);
            }
            return new QuirklFunc(newFunc, this.getTerm());
        } else return this.add(this.cast(other.getValue()));
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MINUS.toString(), this.getType(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MULTIPLY.toString(), this.getType(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.DIVIDE.toString(), this.getType(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MODULO.toString(), this.getType(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.POWER.toString(), this.getType(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> root(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.ROOT.toString(), this.getType(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MINUS.toString(), this.getType(), this.getScope(), this.getCoord());
    }

    public QuirklType<?> call(QuirklType<?>... args) throws QuirklRuntimeException {
        return this.value.apply(args);
    }
}
