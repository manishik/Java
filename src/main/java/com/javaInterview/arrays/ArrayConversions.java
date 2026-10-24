package com.javaInterview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayConversions {

    public static void main(String[] args) {

        // ---------- String[] ----------
        String[] strArray = new String[] {"John", "Mary", "Bob"};
        // Arrays.toString is a debug format: brackets + commas
        System.out.println("Arrays.toString(String[]) = " + Arrays.toString(strArray));

        // String[] -> String (real join)
        String joined = String.join(" ", strArray);
        System.out.println("String[] -> String = " + joined);

        // String -> String[]
        String[] split = joined.split(" ");
        System.out.println("String -> String[] = " + Arrays.toString(split));

        // String[] -> List<String>
        List<String> fixedList = Arrays.asList(strArray);       // fixed-size, backed by the array
        List<String> list = new ArrayList<>(Arrays.asList(strArray)); // modifiable copy
        System.out.println("String[] -> List = " + list + ", fixed-size view = " + fixedList);

        // List<String> -> String[]
        String[] fromList = list.toArray(new String[0]);
        System.out.println("List -> String[] = " + Arrays.toString(fromList));

        // ---------- int[] ----------
        int[] intArray = { 7, 9, 5, 1, 3 };
        System.out.println("Arrays.toString(int[]) = " + Arrays.toString(intArray));

        // int[] -> String
        String nums = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("int[] -> String = " + nums);

        // String -> int[]
        int[] parsed = Arrays.stream(nums.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("String -> int[] = " + Arrays.toString(parsed));

        // int[] -> List<Integer> (Arrays.asList(intArray) would give List<int[]>, not List<Integer>)
        List<Integer> intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        System.out.println("int[] -> List<Integer> = " + intList);

        // List<Integer> -> int[]
        int[] fromIntList = intList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("List<Integer> -> int[] = " + Arrays.toString(fromIntList));

        // int[] -> Integer[]
        Integer[] boxed = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
        System.out.println("int[] -> Integer[] = " + Arrays.toString(boxed));

        // ---------- char[] ----------
        String string2 = "MyString has spaces and 123 numbers";
        System.out.println("String = " + string2);

        // String -> char[]
        char[] charArray = string2.toCharArray();
        System.out.println("String -> char[] = " + Arrays.toString(charArray));

        // char[] -> String
        String back1 = new String(charArray);
        String back2 = String.valueOf(charArray);
        System.out.println("char[] -> String = " + back1 + " | " + back2);

        // Gotcha: println(char[]) prints the chars, but concatenation prints the array reference
        System.out.println(charArray);
        System.out.println("Concatenated char[] = " + charArray);

        // Iterating chars
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
