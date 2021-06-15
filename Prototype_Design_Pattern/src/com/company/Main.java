package com.company;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       CloneFactory cloneFactory = new CloneFactory();
       Pubg pubg = new Pubg();
       Pubg clonedPubg = (Pubg) cloneFactory.getClone(pubg);
       System.out.println(pubg);
       System.out.println(clonedPubg);

       Ludo ludo = new Ludo();
       Ludo clonedLudo = (Ludo) cloneFactory.getClone(ludo);
        System.out.println(ludo);
        System.out.println(clonedLudo);
    }
}
