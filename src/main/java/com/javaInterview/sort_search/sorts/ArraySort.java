package com.javaInterview.sort_search.sorts;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 5, -3, 11, 2, 6, 1, 10};
        System.out.println("int array before sorting: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        Arrays.sort(intArray);  // SORTING INT ARRAY
        System.out.println("Sorted int array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        //Convert int[] to Integer[]
        Integer[] integerArray = new Integer[intArray.length];
        Arrays.setAll(integerArray, i -> intArray[i]);

        //Integer[] integerArray1 = new Integer[]{1, 5, -3, 3, 11, 2, 6, 1, 0, -1};

        System.out.println("Integer Array after reverse sorting: ");
        Arrays.sort(integerArray, Collections.reverseOrder());  // REVERSE SORTING INT ARRAY

        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i] + " ");
        }

        System.out.println();
        String[] strArray = new String[] { "char", "int", "double", "Integer", "Manish", "small", "Keshav", "letter",
                "Something", "Marx", "Bubble", "Random" , "word", "again", "123", "0", "88", "87", "878", "12", "-123", "-3", "zero", "ZERO"};

        System.out.println("Array before sorting: " + Arrays.toString(strArray));

        Arrays.sort(strArray);

        System.out.println("Sorted array: ");
        for (String string : strArray) {
            System.out.print(string + " ");
        }

    }
}
