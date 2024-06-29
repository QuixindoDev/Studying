package com.quixindo.study;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza"); // Add an element in array
        food.add("Hamburguer");
        food.add("Rice");

        food.set(0, "Bean"); // Replace an item by index

        food.clear(); //Delete everything

        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
