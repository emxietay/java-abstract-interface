package com.manhnam.array.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public  class Exercise42SortedArray {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getInteger(int number) {
        int[] intArray = new int[number];
        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static  int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        Arrays.sort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[array.length - 1 - i];
        }
        return sortedArray;
    }
}
