package com.apl.quirkyfun.language.semantics.model.type;

public class QuirklBoolean extends QuirklType<Boolean> {

    public QuirklBoolean() {
        super();
    }

    public QuirklBoolean(Boolean value) {
        super(value);
    }

    public Number parseToNumber() {
        return this.getValue() ? 1 : 0;
    }

    public QuirklBoolean eq(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue().equals(other.getValue()));
    }

    public QuirklBoolean neq(QuirklBoolean other) {
        return new QuirklBoolean(!this.getValue().equals(other.getValue()));
    }

    public QuirklBoolean and(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue() && other.getValue());
    }

    public QuirklBoolean or(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue() || other.getValue());
    }

    public QuirklBoolean not() {
        return new QuirklBoolean(!this.getValue());
    }

    public QuirklBoolean xor(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue() ^ other.getValue());
    }

    public QuirklBoolean gt(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue().compareTo(other.getValue()) > 0);
    }

    public QuirklBoolean lt(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue().compareTo(other.getValue()) < 0);
    }

    public QuirklBoolean gte(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue().compareTo(other.getValue()) >= 0);
    }

    public QuirklBoolean lte(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue().compareTo(other.getValue()) <= 0);
    }

    public QuirklBoolean nand(QuirklBoolean other) {
        return new QuirklBoolean(!(this.getValue() && other.getValue()));
    }

    public QuirklBoolean nor(QuirklBoolean other) {
        return new QuirklBoolean(!(this.getValue() || other.getValue()));
    }

    public QuirklBoolean xnor(QuirklBoolean other) {
        return new QuirklBoolean(this.getValue() == other.getValue());
    }
}
