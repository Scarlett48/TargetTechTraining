package com.aique.oops.aggregation;

public class Branch
{
    public static void main(String arg[])
    {
        Bank bank = new Bank("AXIS", 12345);
        Customer customer = new Customer("Ram", 123456789, 100000);
        bank.displayAllDetails(customer);
    }
}
