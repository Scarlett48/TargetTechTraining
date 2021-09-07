package com.aique.oops.classes.classestypes;

/**
 * Inner classes have the following subtypes:
 *
 * Nested Inner class
 * Method Local Inner class
 * Anonymous Inner class
 * Static Nested class
 * #1) Nested Inner Class
 *
 * A nested inner class has access to private member variables of an outer class. We can also apply access modifiers to the nested inner class.
 *
 * #2) Method Local Inner Class
 *
 * This is the inner class that is declared inside an outer class method.
 *
 * #3) Anonymous Inner Class
 *
 * Anonymous inner class is an inner class declared inside an outer class and is without any name.
 *
 * #4) Static Nested Class
 *
 * The way a class has a static member variable, it can also have a static class as its member.
 */
public class NestedClass {

    public NestedClass(){
        System.out.println("NestedClass constructor");
    }
    //nested/inner class enclosed inside Main class.
    class InnerClass {
        public InnerClass(){
            System.out.println("Inner class constructor");
        }
        public void inner_print() {
            System.out.println("Inner class");
        }
    }
    public static void main(String[] args) {

        NestedClass n = new NestedClass();
        n.callCtor();
        System.out.println("Main in Outer class");
    }

    public  void callCtor(){
        NestedClass.InnerClass in = new InnerClass();
        in.inner_print();
    }

}
