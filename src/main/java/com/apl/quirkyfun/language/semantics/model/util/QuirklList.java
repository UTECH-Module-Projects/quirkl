package com.apl.quirkyfun.language.semantics.model.util;

import java.util.ArrayList;

public class QuirklList<E> extends ArrayList<E> implements Cloneable {

    public String[] toStringArr() {
        return this.stream().map(E::toString).toArray(String[]::new);
    }
}
