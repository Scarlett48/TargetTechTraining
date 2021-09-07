package com.aique.oops.aggregation;

public class Bank
{
    String nameOfBank;;
    int IFSC;

    Bank(String nameOfBank, int IFSC)
    {
        this.nameOfBank = nameOfBank;
        this.IFSC = IFSC;
    }

    public void displayAllDetails(Customer customer)
    {
        System.out.println("Name of Bank = "+ nameOfBank);
        System.out.println("IFSC of Bank = "+ IFSC);

        System.out.println("Name of Customer = "+ customer.nameOfCustomer);
        System.out.println("Account number of Customer = "+ customer.accountNumber);
        System.out.println("Amount of Customer = "+ customer.amount);
    }

}
