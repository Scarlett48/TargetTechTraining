package com.aique.multithreading.callable;

import java.util.concurrent.Callable;

public class CallableTask {

    public static void main(String[] args) throws Exception {
        Callable<String> callable = new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "Hello Callable";
            }
        };

        System.out.println(callable.call());

    }
}
