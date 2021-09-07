package com.aique.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionExample2 {

    @Test
    void test_exception_custom() {
        Exception exception = assertThrows(NameNotFoundException.class, () -> findByName("Alex"));
        assertTrue(exception.getMessage().contains("not found"));
    }

    String findByName(String name) throws NameNotFoundException{
        throw new NameNotFoundException( name + " not found!");
    }
}
