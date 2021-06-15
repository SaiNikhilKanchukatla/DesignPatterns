package com.company;

public class ModeofPayment {

    public Billpayment getMode(int modeOpted){
        switch (modeOpted){
            case 1 : return new UPI();
            case 2 : return new Netbanking();
            case 3 : return new Creditcard();
            case 4 : return new Debitcard();
            default: return null;
        }
    }
}
