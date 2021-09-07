package com.aique.oops.classes.ctor1;

public class Student {

     private String name;

    int noOfSubjects;
    {
        System.out.println("Instance initializer");
    }

    static {
        System.out.println("Instance initializer");
    }
    public  Student(){
        System.out.println("Default construtor is called ");

    }

    public  Student(String name, int age){
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        this.name = name;

    }

    public  Student(String name, int age, String city){
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);


    }

    public int getNoOfSubjects(int noOfSubjects){

        return noOfSubjects;
    }

}
