package com.aique.oops.classes.classestypes;


final class City
{
    final String cityName;
    final int cityId;
    //parameterised constructor
    public City(String name, int id)
    {
        this.cityName = name;
        this.cityId = id;
    }
    //getters for member variables
    public String getCityName()
    {
        return cityName;
    }
    public int getCityId()
    {
        return cityId;
    }
}

public class ImmutableClass {

    public static void main(String args[])
    {
        City city = new City("New York", 1001);
        System.out.print("City Id:" + city.getCityId() + " ");
        System.out.println("City Name:" + city.getCityName());

        //city.cityId = 1002;    //cannot assign a value to final variable regNo
    }
}
