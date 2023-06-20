package com.manhnam.array.lesson1;

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
    public static void main(String[] args) {
        System.out.println();
        int[] newIntArray =  getRandomArray(20);
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list in the index of: " + Arrays.binarySearch(sArray, "Mark"));
        }

        int[] s1 = {1, 2, 4, 5};
        int[] s2 = {5, 2, 4, 1};
        if (Arrays.equals(s1, s2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
