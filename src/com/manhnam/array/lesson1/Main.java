package com.manhnam.array.lesson1;

import java.util.Arrays;
import java.util.Random;

import static com.manhnam.array.MinimumElement.*;
import static com.manhnam.array.lesson1.Exercise42SortedArray.*;

public class Main {

    public static void main(String[] args) {

//        System.out.println(findMin());
    }
public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}


