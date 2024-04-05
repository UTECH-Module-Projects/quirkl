package com.apl.quirkl.language.semantics.model.util;

import java.util.ArrayList;
import java.util.Collection;

public class QuirklList<E> extends ArrayList<E> {

    public QuirklList() {
        super();
    }

    public QuirklList(Collection<? extends E> c) {
        super(c);
    }

    public String[] toStringArr() {
        return this.stream().map(E::toString).toArray(String[]::new);
    }

    public String toStringBy(String delimiter) {
        return String.join(delimiter, this.toStringArr());
    }

}
