package com.aique;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomStringUtilsTest {
    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "level", "refer", "deified", "civic" })
    void isPalindrome(String word) {

        assertTrue(CustomStringUtils.isPalindrome(word));
    }

}
