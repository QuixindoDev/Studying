package com.quixindo.study;

import java.util.Scanner;

public class UInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        //Cleaning the buffer
        scanner.nextLine();

        System.out.println("What's your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("Your are "+age+" year old");
        System.out.println("And your favorite food is "+ food);
    }
}
