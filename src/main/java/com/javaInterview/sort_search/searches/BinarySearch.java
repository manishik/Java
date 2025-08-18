package com.javaInterview.sort_search.searches;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {

    public static void main(String[] args) {

        // Array MUST be SORTED (Ascending Order) in order to do a Binary Search
        int sortedArray[] = {-88, -11, -6, 0, 12, 44, 55, 91, 222, 333, 666, 770, 889, 921, 4456}; // Ascending Order
        //int array[] = {889, 444, 333, 323, 222, 111, 100, 99, 33}; // Decending Order - Doesn't work
        int keyElement = 333;

        //Remember to print an int array without iterating
        System.out.println("Given Sorted Array = " + Arrays.toString(sortedArray));
        System.out.println("Key to be searched = " + keyElement);

        int indexPos = binarySearch(sortedArray, 0, sortedArray.length - 1, keyElement);
        if (indexPos == -1 || indexPos < 0) {
            System.out.println("Key " + keyElement + " is not found in the Array ");
        } else {
            System.out.println("Key " + keyElement + " is found at index position " + indexPos + " of the Array " + Arrays.toString(sortedArray));
        }

        List<Integer> listofInts = Arrays.stream(sortedArray).boxed().collect(Collectors.toList());
        int index = Collections.binarySearch(listofInts, keyElement);  // Searching using Java pre-defined functions
        if (index == -1 || index < 0) {
            System.out.println("Key " + keyElement + " is not found in the Array ");
        } else {
            System.out.println("Key " + keyElement + " is found at index position " + index + " of the Array " + Arrays.toString(sortedArray));
        }

    }

    // Iterative version
    public static int binarySearch(int[] sortedArray, int firstIndex, int lastIndex, int key) {
        int middleIndex = 0;
        while (firstIndex <= lastIndex) {
            middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            if (sortedArray[middleIndex] == key) {
                return middleIndex;
            } else if (sortedArray[middleIndex] < key) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        return -1; // Not Found
    }
}
