package com.aique.solid.ocp.o1;


enum Color{
    RED, GREEN, BLUE
}

enum Size{
    SMALL, MEDIUM, LARGE, YUGE
}

public class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
