package com.aique.solid.isp.i2.polluted;

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();

    //Loan related methods
    void intiateLoanSettlement();
    void initiateRePayment();
}
