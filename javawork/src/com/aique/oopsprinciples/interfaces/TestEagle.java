package com.aique.oopsprinciples.interfaces;

public class TestEagle {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();
        Animal animal  = new Eagle();
        Bird bird  = new Eagle();
        animal.eat();
        animal.sound();
        bird.sound();

        System.out.println("Number of legs: " + Bird.numberOfLegs);
        System.out.println("Outer covering: " + Bird.outerCovering);
    }
}
