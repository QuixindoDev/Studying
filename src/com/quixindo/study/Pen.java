package com.quixindo.study;

public class Pen {
    public String model;
    public String color;
    public double point;
    public int charge;
    public boolean closed;

    public void status(){
        System.out.println("Model: "+this.model);
        System.out.println("Color: "+this.color);
        System.out.println("Point: "+this.point);
        System.out.println("Charge: "+this.charge);
        System.out.println("Closed: "+this.closed);
    }

    public void write(){
        if (this.closed == true){
            System.out.println("I'm sorry. I can't write.\nPlease open the pen.");
        } else {
            System.out.println("I'm writing right now.");
        }
    }

    public void close(){
        this.closed = true;
    }

    public void open(){
        this.closed = false;
    }
}
