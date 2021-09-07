package com.aique.oops.classes.methods;

import com.aique.oops.classes.ctor2.FileUtility;

public class TestMethods {



    public  void add(int a, int b) {
        System.out.println("Hello, this is add method");
        int c = a + b;
        System.out.println("c:" + c);
    }

    private  int returnAdd(int a, int b) {
        System.out.println("Hello, this is returnAdd method");
        int c = a + b;
        FileUtility.readFile("file1");
        return c;
    }

    public static void addStatic(double a, double b) {
        System.out.println("Hello, this is addStatic method");
        double c = a + b;
        System.out.println("c:" + c);
    }

    public static void main(String[] args) {

        TestMethods tm = new TestMethods();
        tm.add(4, 2);
        TestMethods.addStatic(4.2, 2.3);

        int result=tm.returnAdd(10,10);
        System.out.println("result:" + result);


    }

}
