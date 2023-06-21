package com.manhnam.abstract1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Wolf", "big", 150);
        dog.makeNoise();
        Animal wolf = new Dog("dog", "small", 50);
        wolf.makeNoise();
        dog.move("slow");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Gold fish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));
        animals.add(new Horse("Slydesdale", "large", 1000));

        for (Animal animal: animals
             ) {
        doAnimalStuff(animal);
            if (animal instanceof Fish currentMammal) {
                currentMammal.shedHair();
            }

        }
        System.out.println(dog.getExplicitType());
        System.out.println(animals.get(2).getExplicitType());
    }

    public static void doAnimalStuff(Animal animal) {
        animal.move("Slow");
        animal.makeNoise();
    }
}

