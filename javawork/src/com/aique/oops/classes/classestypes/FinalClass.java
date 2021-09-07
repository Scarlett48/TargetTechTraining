package com.aique.oops.classes.classestypes;


//final class
final class BaseClass {
    void Display() {
        System.out.println("BaseClass::Display()");
    }
}
//class DerivedClass extends BaseClass { //Compile-time error - can't inherit final class
class DerivedClass {
    void Display() {
        System.out.println("DerivedClass::Display()");
    }
}

public class FinalClass {
    public static void main(String[] arg) {
        BaseClass baseObj = new BaseClass();   //create a final class object
        baseObj.Display();
        DerivedClass deriObj = new DerivedClass();
        deriObj.Display();
    }
}
