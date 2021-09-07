package com.aique.generics.fundamentals;


class MBound<T extends MA & MB> {

    private T objRef;

    public MBound(T obj){
        this.objRef = obj;
    }

    public void doRunTest(){
        this.objRef.displayClass();
    }
}

interface MB {
    public void displayClass();
}

class MA implements MB {
    public void displayClass()
    {
        System.out.println("Inside super class A");
    }
}

public class MBoundGenerics {
    public static void main(String a[])
    {
        //Creating object of sub class A and
        //passing it to Bound as a type parameter.
        MBound<MA> bea = new MBound<MA>(new MA());
        bea.doRunTest();

    }
}
