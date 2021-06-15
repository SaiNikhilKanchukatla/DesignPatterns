package com.company;

public class Debitcard implements Billpayment{
    @Override
    public void payBill() {
        System.out.println("Redirecting to debit card...\nPlease details to proceed the payment");
    }
}
