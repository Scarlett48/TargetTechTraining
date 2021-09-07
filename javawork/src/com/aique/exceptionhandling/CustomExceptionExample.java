package com.aique.exceptionhandling;

public class CustomExceptionExample {
    public void doSomething() throws CustomException {
        // code with very important logic
        throw new CustomException("My Own Exception!");
    }
}
