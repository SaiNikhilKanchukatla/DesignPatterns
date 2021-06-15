package com.company;

public class Netbanking implements Billpayment{
    @Override
    public void payBill() {
        System.out.println("Redirecting to Netbanking....\nEnter vaild username and password to proceed for payment");
    }
}
