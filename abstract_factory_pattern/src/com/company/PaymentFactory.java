package com.company;

public class PaymentFactory implements AbstractFactory{

    @Override
    public BillPayment modeOfBillPayment(int mode) {
        switch (mode){
            case 1: return new CreditCard();
            case 2: return new NetBanking();
        }
        return null;
    }

    @Override
    public Bank getBank(int bankName) {
        return null;
    }

}
