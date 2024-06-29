package com.quixindo.study;

import java.util.ArrayList;

/*
2D ArrayList = dynamic list of lists
You can change the size of lists during runtime
*/

public class TwoDArrList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomato");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Coffee");
        drinksList.add("Soda");

        groceryList.add(drinksList);
        groceryList.add(produceList);
        groceryList.add(bakeryList);

        System.out.println(groceryList);
    }
}
