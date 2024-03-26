package com.apl.quirkyfun.language.model.expression;

import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;

public abstract class Expression {
    public abstract QuirkyType eval() throws QuirkyMathException;
}
