package com.aique.arrays;

public class ArraysExample {
    double[][] matrix = {{1.2, 4.3, 4.0},
            {4.1, -1.1}
    };

    public static void forEachLoop(){
        int[] age = {12, 4, 5};

        System.out.println("for-each Loop...");
        for(int a : age) {
            System.out.println(a);
        }
    }
    public static void main(String[] args) {

        int[] age = {12, 4, 5};

        int [] a  = new int[10];
         a[0]=10;
        float [] f = new float[10];

        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        forEachLoop();
    }
}
