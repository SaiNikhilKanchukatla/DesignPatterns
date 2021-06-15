package com.company;

public class openYouTube implements Chain{

   private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void executeCommand(Command command) {
        if(command.getChoice()==2){
            System.out.println("Opening Youtube........");
        }
        else{
            nextChain.executeCommand(command);
        }
    }

}
