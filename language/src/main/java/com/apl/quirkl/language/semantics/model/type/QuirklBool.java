package com.apl.quirkl.language.semantics.model.type;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;

public class QuirklBool extends QuirklType<Boolean> {

    public static final QuirklBool TRUE = new QuirklBool(true, Prog.INSTANCE);
    public static final QuirklBool FALSE = new QuirklBool(false, Prog.INSTANCE);

    public QuirklBool() {
        super(false, Prog.INSTANCE);
    }

    public QuirklBool(Boolean value, ProgTerm term) {
        super(value, term);
    }

    public QuirklBool(QuirklBool value) {
        super(value.getValue(), value.getTerm());
    }

    @Override
    public QuirklBool cast(Object value) throws QuirklCastException {
        String valueStr = value.toString().toLowerCase();
        if (value instanceof Double) return (Double) value == 0 ? FALSE : TRUE;
        if (value instanceof QuirklFuncValue) return valueStr.equals(QuirklFunc.EMPTY.toString()) ? FALSE : TRUE;
        if (valueStr.isBlank()) return FALSE;
        return switch (valueStr) {
            case "false", "null", "0" -> FALSE;
            default -> TRUE;
        };
    }

    @Override
    public QuirklVoid toVoid() {
        return QuirklVoid.VOID;
    }

    @Override
    public QuirklBool toBoolean() {
        return new QuirklBool(this);
    }

    @Override
    public QuirklLongNum toLong() {
        return new QuirklLongNum(this.getValue() ? QuirklLongNum.ONE : QuirklLongNum.ZERO);
    }

    @Override
    public QuirklDoubleNum toDouble() {
        return new QuirklDoubleNum(this.getValue() ? QuirklDoubleNum.ONE : QuirklDoubleNum.ZERO);
    }

    @Override
    public QuirklString toStr() {
        return new QuirklString(this.getValue().toString(), this.getTerm());
    }

    @Override
    public QuirklFunc toFunction() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), TYPE.FUNCTION, this.getScope(), this.getCoord());
    }

    @Override
    public QuirklErr toError() throws QuirklCastException {
        throw QuirklCastException.notCompatible(this.toString(), TYPE.ERROR, this.getScope(), this.getCoord());
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toBoolean().getValue());
    }

    @Override
    public QuirklType<?> add(QuirklType<?> other) throws QuirklMathException {
        return this.or(other.toBoolean());
    }

    @Override
    public QuirklType<?> subtract(QuirklType<?> other) throws QuirklMathException {
        return this.xor(other.toBoolean());
    }

    @Override
    public QuirklType<?> multiply(QuirklType<?> other) throws QuirklMathException {
        return this.and(other.toBoolean());
    }

    @Override
    public QuirklType<?> divide(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.DIVIDE.toString(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> modulus(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.MODULO.toString(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> power(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.POWER.toString(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> root(QuirklType<?> other) throws QuirklMathException {
        throw QuirklOperationException.notCompatible(TwoExpOpExp.OP.ROOT.toString(), other.getType(), this.getScope(), this.getCoord());
    }

    @Override
    public QuirklType<?> negate() throws QuirklMathException {
        return this.not();
    }


}
