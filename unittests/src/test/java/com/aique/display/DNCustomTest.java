package com.aique.display;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("I'm a Test Class")
public class DNCustomTest {

    @Test
    @DisplayName("Test with spaces, expected ok")
    void test_spaces_ok() {
    }

    @DisplayName("Test with spaces, expected failed")
    @Test
    void test_spaces_fail() {
    }

}
