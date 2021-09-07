package com.aique.defaultmethods.dimond;

public interface A {

    default void doSomething(){
        System.out.println("A");
    }
}
