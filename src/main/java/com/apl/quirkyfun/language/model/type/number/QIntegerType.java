package com.apl.quirkyfun.language.model.type.number;

import lombok.Getter;

@Getter
public class QIntegerType extends QNumberType {
    private final int value;

    public QIntegerType(int value) {
        this.value = value;
    }

    @Override
    public Integer parse() {
        return value;
    }
}
