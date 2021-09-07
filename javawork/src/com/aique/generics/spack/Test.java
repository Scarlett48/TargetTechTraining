package com.aique.generics.spack;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

//        int a1=10;
//        float f =10.11f;
//        double d = 12.00000;
//        long l = 123L;
//        String s ="Name";
//        Integer a11 = new Integer(10);
//
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);

        List<?> l =fruits;
        List<?> l1 =numbers;
//
////        fruits.add(100);
//
//
//        for (int i=0;i<fruits.size();i++){
//            String s1 = fruits.get(i);
//
//            System.out.println(s1);
//        }

        MyGenric g = new MyGenric();
//       int res =  g.add(10,12);
//       System.out.println(res);
//
//        float fres =  g.add(10.10f,12.18f);
//        System.out.println(fres);
        BoundInherit b = new BoundInherit();
        BoundInherit2 b2 = new BoundInherit2();
        BoundInherit3 b3 = new BoundInherit3();
          g.getValue(b);
          g.getValue(b2);
//        g.getValue(b3);

    }
}

class MyGenric<T extends Bound>{

//    public int add(int a, int b){
//        return a+b;
//    }
//
//    public float add(float a, float b){
//        return a+b;
//    }

    public  T getValue(T a){
        return a;
    }

    void addListObjects(ArrayList<String> list){

    }

     public BoundInherit getObject(BoundInherit b){
         //BoundInherit b = new BoundInherit();
        return b;
     }

    public BoundInherit2 getObject1(BoundInherit2 b2){
//        BoundInherit2 b = new BoundInherit2();
        return b2;
    }

}

class Bound {}
class BoundInherit extends Bound{

    void printMe(){}

}

class BoundInherit2 extends Bound{

    void printMe2(){}

}

class BoundInherit3 {

    void printMe3(){}

}