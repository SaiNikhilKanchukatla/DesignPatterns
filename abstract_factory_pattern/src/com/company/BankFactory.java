package com.company;

public class BankFactory implements AbstractFactory{

    @Override
    public Bank getBank(int bankName) {
        switch (bankName){
            case 1 : return new SBI();
            case 2: return new Paytm();
        }
        return null;
    }

    @Override
    public BillPayment modeOfBillPayment(int mode) {
        return null;
    }
}
