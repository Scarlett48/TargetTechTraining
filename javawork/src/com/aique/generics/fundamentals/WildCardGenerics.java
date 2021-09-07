package com.aique.generics.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardGenerics {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Jack"), new Employee("John"));
        List<Accountant> accountantList = Arrays.asList(new Accountant("Mike"), new Accountant("Smith"));

        //COMPILE TIME ERROR
        //employeeList = accountantList;
        //accountantList = employeeList;

        List<?> unknownWildCard = new ArrayList<Employee>();
        List<? extends Employee> extendWildCard = new ArrayList<Employee>();
        List<? super Employee> superWildCard = new ArrayList<Employee>();

        ArrayList<Integer> a = new ArrayList<>();

    }

    private static void doSomething(List<Employee> employees) {
        employees.forEach(e -> {
            //do some thing
        });
    }

    private static void doSomething1(List<?> employees) {
        employees.forEach(e -> {
            //do some thing
        });
    }

    private static void doSomething12(List<? extends Emaplyee> employees) {
        employees.forEach(e -> {
            //do some thing
        });
    }

    public static void insertElements(List<? super Employee> list) {
        list.add(new Accountant("Employee"));
        list.add(new Employee("Accountant"));
        list.add(new Manager("Manager"));
    }
}

class Emaplyee {
    String name;

    public Emaplyee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emaplyee{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }
}

class Accountant extends Employee {

    public Accountant(String name) {
        super(name);
    }
}