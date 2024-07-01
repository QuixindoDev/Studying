package com.quixindo.study;
/*
2D ARRAY = An array of arrays
*/
public class TwoDArr {
    public static void main(String[] args) {
        /*
        String[][] cars = {"Mustang", "Corvette", "Toyota"},
                        {"BMW", "WOLKSWAGEN", "Mercedes Benz"},
                        {"Mitsubishi", "Iveco", "Land Cruiser"};

         */
        String[][] cars = new String[3][3];

        cars[0][0] = "Mustang";
        cars[0][1] = "Corvette";
        cars[0][2] = "Toyota";
        cars[1][0] = "BMW";
        cars[1][1] = "WOLKSWAGEN";
        cars[1][2] = "Mercedes Benz";
        cars[2][0] = "Mitsubishi";
        cars[2][1] = "Iveco";
        cars[2][2] = "Land Cruiser";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++){
                System.out.println(cars[i][j]);
            }
        }
        }
    }

