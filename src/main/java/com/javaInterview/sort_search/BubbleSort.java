package com.javaInterview.sort_search;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = new int[]{67, 8, 2, 23, 0, 45745, 3954, 345, 55, -1, -33, -2057};
        System.out.println("Unsorted integer array = " + Arrays.toString(numbers));
        bubbleSort(numbers);
    }

    static void bubbleSort(int[] intArray) {
        int tempInt;
        int arrayLength = intArray.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 1; j < arrayLength; j++) {
                if (intArray[j] < intArray[j - 1]) {
                    tempInt = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = tempInt;
                }
            }
        }
        System.out.print("Sorted integer array = ");
        for (int i : intArray) {
            System.out.print(" " + i);
        }

    }

}
