package com.javaInterview.sort_search;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) return;
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] temp, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) >>> 1; // Safe mid calculation
        mergeSort(array, temp, left, mid);
        mergeSort(array, temp, mid + 1, right);
        merge(array, temp, left, mid, right);
    }

    private static void merge(int[] array, int[] temp, int left, int mid, int right) {
        System.arraycopy(array, left, temp, left, right - left + 1);

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k++] = temp[i++];
            } else {
                array[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            array[k++] = temp[i++];
        }
        // No need to copy the right half, already in place
    }

    // Example usage
    public static void main(String[] args) {
        // var arr = new int[] { 38, 27, 43, 3, 9, 82, 10 };
        //int size = Integer.MAX_VALUE;
        int size = 1000000000;
        int[] largeArray = generateRandomArray(size);

        System.out.println("Sorting 1 billion integers...");
        long start = System.currentTimeMillis();
        System.out.println("Time in main() is : " + (System.currentTimeMillis() - start)/1000 + " seconds");

        mergeSort(largeArray);

        long end = System.currentTimeMillis();

        long seconds = ((end - start) / 1000);
        long S = seconds % 60;  // Calculate the remaining seconds
        long H = seconds / 60;  // Convert total seconds to minutes
        long M = H % 60;         // Calculate the remaining minutes
        H = H / 60;            // Convert total minutes to hours

        // Display the time in the format HH:MM:SS
        System.out.println(H + ":" + M + ":" + S);
        System.out.println("Time is : " + seconds + " seconds");
        // Optional: Print first 10 elements to verify
        System.out.println("First 10 elements: " + Arrays.toString(Arrays.copyOfRange(largeArray, 0, 10)));
        //System.out.println("Sorted: " + Arrays.toString(largeArray));
    }

    // Helper to generate random integers
    private static int[] generateRandomArray(int size) {
        long start = System.currentTimeMillis();
        System.out.println("Time in generateRandomArray() is : " + (System.currentTimeMillis() - start)/1000 + " seconds");
        var random = new Random();
        var array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000000);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time in generateRandomArray()  is : " + (end - start)/1000 + " seconds");
        return array;
    }
}