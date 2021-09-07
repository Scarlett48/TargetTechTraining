package com.aique.exceptionhandling;

import java.io.FileNotFoundException;

public class TestMain {

    public static void main(String[] args) throws FileNotFoundException, CustomException {
//        CheckedExceptions ce =  new CheckedExceptions();
//        ce.throwsExample();
        CustomExceptionExample ce  = new CustomExceptionExample();
        ce.doSomething();
    }
}
