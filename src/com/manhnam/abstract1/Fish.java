package com.manhnam.abstract1;

import java.util.Objects;


public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (Objects.equals(speed, "slow")) {
            System.out.println(type + " lazily swimming");
        } else {
            System.out.println(this.getExplicitType() + " fast swimming");
        }
    }

    @Override
    public void makeNoise() {
        if (Objects.equals(type, "Goldfish")) {
            System.out.println(type + ".......");
        } else {
            System.out.println(type + "...hhhhh");
        }
    }
}
