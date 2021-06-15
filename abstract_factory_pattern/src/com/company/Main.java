package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Select the Bank");
        System.out.println("1.SBI");
        System.out.println("2.Paytm");
        int bankOpted= scan.nextInt();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankOpted);

        System.out.println("Welcome to "+ bank.getBankName());

        System.out.println("Select the Payment way");
        System.out.println("1.Credit Card");
        System.out.println("2.NetBanking");
        int modeOpted= scan.nextInt();

        AbstractFactory paymentFactory = FactoryCreator.getFactory("Payment");
        BillPayment billPayment = paymentFactory.modeOfBillPayment(modeOpted);
        billPayment.payBill();

     }
}
