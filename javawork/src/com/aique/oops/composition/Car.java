package com.aique.oops.composition;

public class Car
{
    //final will make sure engine is initialized
    private final Engine engine;
    String nameOfCar;
    String model;

    public Car(String nameOfCar, String model)
    {
        engine  = new Engine("POWERHIGH", "ABC");
        this.nameOfCar = nameOfCar;
        this.model = model;
    }

    public void showAlldetails()
    {
        System.out.println("Name of Car ="+nameOfCar);
        System.out.println("Name of Model ="+model);
        System.out.println("Engine used in Car ="+engine.typeOfEngine);
        System.out.println("Engine name of Car ="+engine.nameOfEngine);
    }

}
