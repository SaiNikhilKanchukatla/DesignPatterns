package com.company;

public class openWhatsApp implements Chain{
    private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void executeCommand(Command command) {
        if(command.getChoice()==1){
            System.out.println("Opening Whatsapp........");
        }
        else{
            nextChain.executeCommand(command);
        }
    }
}
