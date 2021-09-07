package com.aique.generics.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
//        listwithoutGenericsDemo();
        listwithGenericsDemo();
        listWithGenericsAndDiamondOperatorDemo();
        foeEachLoopWithGenerics();
    }

    private static void foeEachLoopWithGenerics() {
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("John");
        names.add("Rock");

        // for-each loop with generic collection
        for (String name : names)
            System.out.println(name);
    }

    private static void listWithGenericsAndDiamondOperatorDemo() {
        List<String> names = new ArrayList<>();
        names.add("This is a String");
        String string = names.get(1);

    }

    private static void listwithGenericsDemo() {

        // Creating names with generics syntax
        List<String> names = new ArrayList<String>();

        // Adding an Integer compile time error
        //names.add(new Integer(75));

        // Adding a String
        names.add("This is a String");

        // getting 0th element and typecasting into Integer Compile time error
        //Integer integer = names.get(0);

        // getting 1st element and typecasting into String without any error
        String string = names.get(1);

    }

    private static void listwithoutGenericsDemo() {
        // Creating names without generics syntax
        List names = new ArrayList();


        // Adding an Integer compile time error
        names.add(new Integer(75));

        // Adding a String
        names.add("This is a String");

        // getting 0th element and explicitly typecasting into Integer
        Integer integer = (Integer) names.get(0);

        // getting 1st element and explicitly typecasting into String
        String string = (String) names.get(1);

        // getting 1st element and typecasting into int leads to ClassCastException
        Integer integerByMistake = (Integer) names.get(1);


        // getting 0th element without typecasting leads to Compile time error
//        Integer integer1 = names.get(0);

    }
}
