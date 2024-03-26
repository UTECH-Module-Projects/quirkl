package com.apl.quirkyfun.language.model.type;

public class QuirkyString extends QuirkyType {

    public QuirkyString(String value) {
        super(value);
    }

    public QuirkyString concat(QuirkyString other) {
        return new QuirkyString(this.value + (String) other.value);
    }
}
