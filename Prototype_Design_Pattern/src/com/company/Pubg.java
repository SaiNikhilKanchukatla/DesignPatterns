package com.company;

public class Pubg implements Game {
    @Override
    public Game makeCopy() throws CloneNotSupportedException {
        Pubg pubg =(Pubg) super.clone();
        return pubg;
    }
}
