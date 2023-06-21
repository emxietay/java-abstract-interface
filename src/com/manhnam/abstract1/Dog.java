package com.manhnam.abstract1;

import java.util.Objects;

public class Dog extends Mammal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (Objects.equals(speed, "slow")) {
            System.out.println(type + " walking");
        } else {
            System.out.println(type + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + "shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if (Objects.equals(type, "Wolf")) {
            System.out.println("Howling! ");
        } else {
            System.out.println("Woof ");
        }
    }
}
