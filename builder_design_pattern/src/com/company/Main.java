package com.company;


public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();

        System.out.println(car);

        Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();

        System.out.println(bike);

    }

}