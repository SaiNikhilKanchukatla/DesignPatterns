package com.company;

public class playMusic implements Chain{
    private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void executeCommand(Command command) {
        if(command.getChoice()==3){
            System.out.println("Opening Youtube........");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
