package com.aique.defaultmethods.conflict;

public interface A {

    default void doSomething(){
        System.out.println("A");
    }
}
