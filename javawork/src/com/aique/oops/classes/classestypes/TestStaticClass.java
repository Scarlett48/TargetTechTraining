package com.aique.oops.classes.classestypes;

class StaticClass {
    // static variable
    static int total;
    // static method
    static void sum(int val1, int val2) {
        System.out.print("Static method to calculate sum:" + " ");
        total = val1 + val2;
        System.out.println(val1 + "+" + val2);
    }
    // static class
    static class NestedClass {
        // static block
        static {
            System.out.println("static block inside a static nested class");
        }
        public void displaySum() {
            sum(25, 75);
            System.out.println("Sum of two numbers:" + total);
        }
    }
}
public class TestStaticClass {
    public static void main(String args[]) {
        // declare static class object
        StaticClass.NestedClass object = new StaticClass.NestedClass();
        // call displaySum method inside a static class
        object.displaySum(); 
    }
}

