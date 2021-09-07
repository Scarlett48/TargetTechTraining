package com.aique.multithreading.interruptjoin;

import static com.aique.multithreading.interruptjoin.ThreadColor.ANSI_RED;


public class MyRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
