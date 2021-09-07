package com.aique.oopsprinciples.polymorphism.dynamic;

public class TestBird {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Bird myBird = new Bird();
        myBird.eat();

        Animal ab = new Bird();
        ab.eat();
    }
}
