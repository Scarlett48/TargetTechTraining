package com.aique.logging;

public class MySop {
    public static void main(String[] args) {
        add(10,20);
    }

    public static int add(int a,int b){
        System.out.println("Inside method add a= "+a+" b="+b);
        return a+b;
    }
}
