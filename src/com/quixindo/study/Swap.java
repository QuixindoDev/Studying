package com.quixindo.study;

public class Swap {
    public static void main(String[] args)
    {
        String x = "Water";
        String y = "Wine";
        String tmp;

        tmp = x;
        x = y;
        y  = tmp;

        System.out.println(x+"\n"+y);
    }
}
