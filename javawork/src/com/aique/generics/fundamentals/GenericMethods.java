package com.aique.generics.fundamentals;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericMethods {
    public static void main(String[] args) {


        String[] namesArray = {"Jack", "John", "Nick"};
        List<String> namesList = fromArrayToList(namesArray);
        System.out.println(namesList);

        Integer[] numberArray = {1, 2, 3, 4, 5};
        List<Integer> numberList = fromArrayToList(numberArray);
        System.out.println(numberList);

        Employee[] employeeArr = {new Employee("Jack"), new Employee("John"), new Employee("Nick")};
        List<Employee> employeeList = fromArrayToList(employeeArr);


        Integer[] intsArray = {1, 2, 3, 4, 5, 6};
        Float[] floatsArray = {1.4f, 2.3f, 3.5f, 4.7f, 5.6f, 6.0f};
        Double[] doublesArray = {1.4, 2.3, 3.5, 4.7, 5.6, 6.0};
        String[] stringArray = {"Jack", "John", "Nick"};

        List<Integer> intsList = fromArrayToListForNumbers(intsArray);
        List<Float> floatsList = fromArrayToListForNumbers(floatsArray);
        List<Double> doublesList = fromArrayToListForNumbers(doublesArray);
        // List<String> StringsList = fromArrayToListForNumbers(stringArray);

        List<Integer> intsList1 = fromArrayToListForNumbersAndComparable(intsArray);
        List<Float> floatsList1 = fromArrayToListForNumbersAndComparable(floatsArray);
        List<Double> doublesList1 = fromArrayToListForNumbersAndComparable(doublesArray);

        //List<String> StfromArrayToListForNumbersAndComparableringsList1 = fromArrayToListForNumbers(stringArray);
        // List<String> employeeList1 = fromArrayToListForNumbersAndComparable(employeeArr);
    }

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T extends Number> List<T> fromArrayToListForNumbers(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    // with two upper bounds
    public static <T extends Number & Comparable> List<T> fromArrayToListForNumbersAndComparable(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    //with three upper bounds one class and other two as interfaces
    public static <T extends Number & Comparable & Serializable> List<T> fromArrayToListForNumbersAndComparableAndSerializable(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
