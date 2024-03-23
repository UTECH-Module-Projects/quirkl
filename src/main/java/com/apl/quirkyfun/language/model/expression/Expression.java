package com.apl.quirkyfun.language.model.expression;

import com.apl.quirkyfun.language.model.type.QType;

public abstract class Expression<T extends QType> {
    public abstract T evaluate();
}
