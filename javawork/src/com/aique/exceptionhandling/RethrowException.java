package com.aique.exceptionhandling;

import java.io.IOException;

public class RethrowException {
    public static void main(String[] args) throws IOException {
        RethrowException exec = new RethrowException();
        exec.run();
    }

    public void run() throws IOException {
        try {
            methodThrowingIOE();
        } catch (IOException ioe) {
            throw ioe;
        }
    }

    public void methodThrowingIOE() throws IOException {
        throw new IOException();
    }
}
