package com.aique.generics.fundamentals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsNeed {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1));
        //compiler will complain
//        Integer i = list.iterator().next();
    }
}
