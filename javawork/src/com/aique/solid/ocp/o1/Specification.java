package com.aique.solid.ocp.o1;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
