package com.quixindo.study;

/*
Today i'm learning about arrays
Arrays are used to store multiple values in a single variable
*/
public class Arr {
    public static void main(String[] args) {
        /*
        String[] cars = {"Camaro, Corvette, Tesla"};

        cars[0] = "BMW";
        System.out.println(cars[0]);
        */

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (String car : cars) {
            System.out.println(car);
        }
        /*
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        */

    }

}
