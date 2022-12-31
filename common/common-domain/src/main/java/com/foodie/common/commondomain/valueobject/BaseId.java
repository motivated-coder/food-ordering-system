package com.foodie.common.commondomain.valueobject;

import java.util.Objects;

public abstract class BaseId<T> {
    private final T t;
    protected BaseId(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseId)) return false;
        BaseId<?> baseId = (BaseId<?>) o;
        return Objects.equals(t, baseId.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t);
    }
}
