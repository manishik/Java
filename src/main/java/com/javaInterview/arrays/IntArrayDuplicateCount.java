package com.javaInterview.arrays;

import java.util.Arrays;

public class IntArrayDuplicateCount {

    public static void main(String[] args) {
        int aArray[] = new int[] { 4, -1, -2, 4, 3, 5, 0, -1, 0 };
        int[] intArray = { 7, 2, 6, 1, 4, 7, 4, 5, 4, 7, 7, 3, 1 };
        duplicate(aArray);
    }

    public static void duplicate(int numbers[]) {

        System.out.println("Array : ");
        for(int i:numbers){
            System.out.print(" " + i);
        }

        System.out.println();
        Arrays.sort(numbers); //Sort the Array

        System.out.println("Sorted Array : ");
        for(int i:numbers){
            System.out.print(" " + i);
        }

        System.out.println();
        int previous = numbers[0] - 1;
        int dupCount = 0;
        int numberOfDup = 0;

        System.out.println("Previous = " + previous);
        System.out.println("Duplicates are : ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == previous) {
                numberOfDup++;
                if (numberOfDup == 1) {
                    dupCount++;
                    if (dupCount == 1) {
                        System.out.print(numbers[i]);
                    }
                    else {
                        System.out.print(", " + numbers[i]);
                    }
                }
            }
            else {
                previous = numbers[i];
                numberOfDup = 0;
            }
        }
        System.out.println();
        System.out.println("There were " + dupCount + " duplicates in the array.");
    }

}
