package com.javaInterview.sort_search.sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {64, 35, 12, 0, 22, 11, 3, -55, -99};
        System.out.println("Unsorted integer array = " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) { // ascending order < OR descending order > sorting
                    // Swap array[j] and array[j-1]
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

}
//Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
//It has O(n²) time complexity in the worst and average case.