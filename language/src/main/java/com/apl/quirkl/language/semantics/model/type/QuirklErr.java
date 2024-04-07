package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.type.value.QuirklErrValue;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;

public class QuirklErr extends QuirklType<QuirklErrValue> {

    public QuirklErr() {
        super(new QuirklErrValue(), Prog.INSTANCE);
    }

    public QuirklErr(QuirklException e) {
        super(new QuirklErrValue(e), Prog.INSTANCE);
    }

    public QuirklErr(QuirklErr err) {
        super(err.getValue(), err.getTerm());
    }

    public void setErr(QuirklException e) {
        this.value.setErrMsg(e.getMessage());
        this.value.setErrType(e.getErrorType());
    }

    @Override
    public QuirklType<?> cast(Object value) throws QuirklCastException {
        throw QuirklCastException.notCompatible(value.toString(), this.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBool toBoolean() {
        return QuirklBool.FALSE;
    }

    @Override
    public QuirklLongNum toLong() {
        return QuirklLongNum.ZERO;
    }

    @Override
    public QuirklDoubleNum toDouble() {
        return QuirklDoubleNum.ZERO;
    }

    @Override
    public QuirklString toStr() {
        return new QuirklString(this.value.toString(), this.getTerm());
    }

    @Override
    public QuirklFunc toFunction() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.value.toString(), TYPE.FUNCTION, this.getScope(), this.getCoord());
    }

    @Override
    public QuirklErr toError() {
        return new QuirklErr(this);
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        throw QuirklMathException.notComparable(this.getType(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> add(QuirklType<?> other) throws QuirklMathException, QuirklFunctionException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.PLUS.toString(), this.getType(), other.getType(), this.getScope(), this.getCoord());
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
}
