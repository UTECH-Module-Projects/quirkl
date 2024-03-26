package com.apl.quirkyfun.language.model.type;

public class QuirkyBoolean extends QuirkyType<Boolean> {
    public QuirkyBoolean(Boolean value) {
        super(value);
    }

    public QuirkyBoolean eq(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue().equals(other.getValue()));
    }

    public QuirkyBoolean neq(QuirkyBoolean other) {
        return new QuirkyBoolean(!this.getValue().equals(other.getValue()));
    }

    public QuirkyBoolean and(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue() && other.getValue());
    }

    public QuirkyBoolean or(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue() || other.getValue());
    }

    public QuirkyBoolean not() {
        return new QuirkyBoolean(!this.getValue());
    }

    public QuirkyBoolean xor(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue() ^ other.getValue());
    }

    public QuirkyBoolean gt(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue().compareTo(other.getValue()) > 0);
    }

    public QuirkyBoolean lt(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue().compareTo(other.getValue()) < 0);
    }

    public QuirkyBoolean gte(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue().compareTo(other.getValue()) >= 0);
    }

    public QuirkyBoolean lte(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue().compareTo(other.getValue()) <= 0);
    }

    public QuirkyBoolean nand(QuirkyBoolean other) {
        return new QuirkyBoolean(!(this.getValue() && other.getValue()));
    }

    public QuirkyBoolean nor(QuirkyBoolean other) {
        return new QuirkyBoolean(!(this.getValue() || other.getValue()));
    }

    public QuirkyBoolean xnor(QuirkyBoolean other) {
        return new QuirkyBoolean(this.getValue() == other.getValue());
    }
}
