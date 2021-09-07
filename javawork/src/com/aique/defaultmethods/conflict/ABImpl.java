package com.aique.defaultmethods.conflict;

public class ABImpl implements A,B{
    @Override
    public void doSomething(){
        System.out.println("ABImpl");
        A.super.doSomething();
    }

    public static void main(String[] args) {
        new ABImpl().doSomething();
    }
}
