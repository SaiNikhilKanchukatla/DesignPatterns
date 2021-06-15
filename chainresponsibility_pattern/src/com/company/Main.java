package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Chain chainOne = new openWhatsApp();
        Chain chainTwo = new openYouTube();
        Chain chainThree = new playMusic();


        chainOne.setNextChain(chainTwo);
        chainTwo.setNextChain(chainThree);

        System.out.println("Choose the command");
        System.out.println("1.open Whatsapp");
        System.out.println("2.open Youtube");
        System.out.println("3.Play Music");

        Scanner scanner = new Scanner(System.in);
        int choice=scanner.nextInt();
        Command command = new Command(choice);
        chainOne.executeCommand(command);
    }
}
