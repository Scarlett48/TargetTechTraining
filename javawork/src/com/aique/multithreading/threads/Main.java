package com.aique.multithreading.threads;

import static com.aique.multithreading.threads.ThreadColor.ANSI_GREEN;
import static com.aique.multithreading.threads.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");


    }
}