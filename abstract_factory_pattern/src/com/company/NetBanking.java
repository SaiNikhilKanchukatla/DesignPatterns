package com.company;

public class NetBanking implements BillPayment{
    @Override
    public void payBill() {
        System.out.println("Redirecting to Netbanking....\nEnter vaild username and password to proceed for payment");
    }
}
