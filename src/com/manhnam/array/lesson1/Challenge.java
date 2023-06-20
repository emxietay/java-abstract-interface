package com.manhnam.array.lesson1;

import java.util.Arrays;
import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        int[] unsortedArray  =getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));
        Arrays.sort(unsortedArray);
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);

        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(reverseArray(sortedArray)));
    }
    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length ; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }
}
