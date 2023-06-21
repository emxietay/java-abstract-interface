package com.manhnam.object.car;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println(porsche.getModel());
        System.out.println(holden.getModel());
        porsche.setModel("holden");
        System.out.println("Model is " + porsche.getModel());

    }
}
