package com.aique;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Double result = calculator.add(10,50);
        if(result != 60) {
            System.out.println("Bad result: " + result);
        }

    }
}
