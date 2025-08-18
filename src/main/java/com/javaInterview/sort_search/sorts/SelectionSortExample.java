package com.javaInterview.sort_search.sorts;

import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Before Sorting" +  Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index is the minimum
            // Find the index of the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }
}

/*

Selection sort is a simple comparison-based sorting algorithm.

Selection Sort works by repeatedly finding the minimum element from the unsorted portion and moving it to the front.
It also has O(n²) time complexity in the worst and average case, but generally does fewer swaps than Bubble Sort.
 */