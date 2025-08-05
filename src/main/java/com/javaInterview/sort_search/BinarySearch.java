package com.javaInterview.sort_search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        // Array MUST be SORTED (Ascending Order) to do a Binary Search
        int array[] = {12, 44, 55, 91, 333, 480, 666, 770, 889, 921, 4456}; // Ascending Order
        //int array[] = {889, 444, 333, 323, 222, 111, 100, 99, 33}; // Decending Order - Doesn't work
        int keyElement = 333;

        //Remember to print an int array without iterating
        System.out.println("Given Array = " + Arrays.toString(array));
        System.out.println("Key to be searched = " + keyElement);

        int indexPos = binarySearch(array, 0, array.length - 1, keyElement);
        System.out.println("Key found at Index = " + indexPos);
    }

    // Iterative version
    public static int binarySearch(int[] array, int firstIndex, int lastIndex, int key) {
        int middleIndex = 0;
        while (firstIndex <= lastIndex) {
            middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            if (array[middleIndex] == key) {
                return middleIndex;
            } else if (array[middleIndex] < key) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        return -1; // Not Found
    }
}
