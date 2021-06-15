package com.company;

public class Ludo implements Game{
    @Override
    public Game makeCopy() throws CloneNotSupportedException {
        Ludo ludo =(Ludo) super.clone();
        return ludo;
    }
}
