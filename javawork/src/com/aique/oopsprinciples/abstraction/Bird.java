package com.aique.oopsprinciples.abstraction;

class Bird extends Animal {

    void move() {
        System.out.println("Moves by flying.");
    }
    void eat() {
        System.out.println("Eats birdfood.");
    }
}

class Fish extends Animal {
    void move() {
        System.out.println("Moves by swimming.");
    }
    void eat() {
        System.out.println("Eats seafood.");
    }
}
