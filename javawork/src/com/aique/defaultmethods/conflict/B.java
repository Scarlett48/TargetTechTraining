package com.aique.defaultmethods.conflict;

public interface B {
    default void doSomething(){
        System.out.println("B");
    }
}
