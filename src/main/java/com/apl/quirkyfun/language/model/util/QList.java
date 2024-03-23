package com.apl.quirkyfun.language.model.util;

import java.util.ArrayList;

public class QList<E> extends ArrayList<E> {

    public String[] toStringArr() {
        return this.stream().map(E::toString).toArray(String[]::new);
    }
}
