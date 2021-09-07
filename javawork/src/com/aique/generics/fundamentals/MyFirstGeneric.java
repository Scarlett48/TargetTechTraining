package com.aique.generics.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirstGeneric {


    public static <T extends MyDemoClass> void fromArrayToList(T[] a) {
        for(T t: a) {
            System.out.println(t);
        }
        //return Arrays.stream(a).collect(Collectors.toList());
    }

    public static void addPlayers(List<?> list){
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        Demo1 abc= new Demo1();
        Demo2 abc2= new Demo2();

        Demo1 [] a =new Demo1[]{abc};
        //a[0]=abc;

        Demo2 [] b =new Demo2[]{abc2};
       // b[0]=abc2;

        String [] s ={"A","B", "C"};

        fromArrayToList(a);

        List<?> l = new LinkedList<>();
        addPlayers(l);

    }
}

class MyDemoClass{}

class Demo1 extends MyDemoClass{}
class Demo2 {}