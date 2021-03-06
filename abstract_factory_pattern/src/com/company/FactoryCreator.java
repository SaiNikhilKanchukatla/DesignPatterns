package com.company;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Payment")){
            return new PaymentFactory();
        }
        return null;
    }
}
