package com.aique;

public class CalculatorTest1 {
    private int nbError = 0;
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            throw new IllegalStateException("Bad result: " + result);
        }
    }
    public static void main(String[] args) {
        CalculatorTest1 test = new CalculatorTest1();
        try {
            test.testAdd();
        } catch (Throwable e) {
            test.nbError++;
            e.printStackTrace(); }
        if(test.nbError > 0) {
            throw new IllegalStateException("There were " + test.nbError + " error(s)");
        }
    }
}
