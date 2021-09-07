package com.aique.generics.fundamentals;

public class GenericClass {
    public static void main(String[] args) {

        userObjectContainerClass();
        userGenericContainerClass();
    }

    private static void userGenericContainerClass() {
        GenericContainer<Box> boxContainer = new GenericContainer<>();
        boxContainer.setElement(new Box("1", "Box 1"));
        Box box = boxContainer.getElement();

        System.out.println(box);

        GenericContainer<String> stringContainer = new GenericContainer<>();
        stringContainer.setElement("Jack");
        String string = stringContainer.getElement();
        System.out.println(string);
    }

    private static void userObjectContainerClass() {
        Container boxContainer = new Container();
        boxContainer.setElement(new Box("1", "Box 1"));
        Box box = (Box) boxContainer.getElement();

        System.out.println(box);

        Container stringContainer = new Container();
        stringContainer.setElement("Jack");
        String string = (String) stringContainer.getElement();
        System.out.println(string);
    }
}

class Box {
    private String id;
    private String name;

    public Box(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class Container {
    private Object element;

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}

class GenericContainer<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

//Generic interface definition
interface GenericInterface<T1, T2> {
    T2 doOneOperation(T1 t);

    T1 doSecondOperation(T2 t);
}

//A class implementing generic interface
class DemoClass implements GenericInterface<String, Integer> {
    public Integer doOneOperation(String t) {
        //some code
        return -1;
    }

    public String doSecondOperation(Integer t) {
        //some code
        return null;
    }
}

