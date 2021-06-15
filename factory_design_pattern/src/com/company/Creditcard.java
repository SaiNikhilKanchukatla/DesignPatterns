package com.company;

public class Creditcard implements Billpayment{
    @Override
    public void payBill() {
        System.out.println("Redirecting to credit card...\nPlease details to proceed the payment");
    }
}
