package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       ModeofPayment mode = new ModeofPayment();
        System.out.println("Select the mode of Payment");
        System.out.println("1.UPI");
        System.out.println("2.Netbanking");
        System.out.println("3.Credit Card");
        System.out.println("4.Debit Card");
        Scanner scan = new Scanner(System.in);
        int modeOpted= scan.nextInt();
        Billpayment modeObject = mode.getMode(modeOpted);
        try {
            modeObject.payBill();
        }
        catch(Exception NullPointerExeception){
            System.out.println("Payment cancelled due to invalid option");
        }
    }
}
