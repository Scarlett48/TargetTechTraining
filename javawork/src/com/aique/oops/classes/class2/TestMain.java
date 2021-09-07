package com.aique.oops.classes.class2;

/**
 *
 */
public class TestMain {

    public static void main(String[] args) {
	    Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
        holden.setModel("carrera");
        System.out.println("Holden Model is " + holden.getModel());

//        ClassNoStates cns = new ClassNoStates();
//        cns.printMe();

    }
}
