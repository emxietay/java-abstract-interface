package com.manhnam.abstract1;

import java.util.Objects;

public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

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
