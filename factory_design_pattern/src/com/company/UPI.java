package com.company;

public class UPI implements Billpayment{

    @Override
    public void payBill() {
        System.out.println("Redirecting to UPI payment....\nPlease enter valid upi id and password to proceed the payment");
    }
}
