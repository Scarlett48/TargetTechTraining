package com.aique.oops.classes.ctor1;

public class TestCtor1 {

    public static void main(String[] args) {


        Account bobsAccount = new Account(); // "12345", 0.00, "Emily Brown", "myemail@gmail.com",
                // "0123456789");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
