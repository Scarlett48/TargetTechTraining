package com.aique.defaultmethods.dimond;

public interface D extends A{
    @Override
    default void doSomething(){
        System.out.println("D");
    }
}
