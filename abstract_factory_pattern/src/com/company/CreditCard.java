package com.company;

public class CreditCard implements BillPayment{
    @Override
    public void payBill() {
        System.out.println("Redirecting to credit card...\nPlease details to proceed the payment");
    }
}
