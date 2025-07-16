package com.javaInterview.arrays;

import java.util.Arrays;

public class ArrayConversions {

    public static void main(String[] args) {

        String[] strArray = new String[] {"John", "Mary", "Bob"};
        System.out.println("Print String Array = " + Arrays.toString(strArray));
        String string = Arrays.toString(strArray);
        System.out.println("String = " + string);

        int[] intArray = { 7, 9, 5, 1, 3 };
        System.out.println("Print Int Array = " + Arrays.toString(intArray));
        String string1 = Arrays.toString(intArray);
        System.out.println("String = " + string1);

        // String to Characters
        String string2 = "MyString has spaces and 123 numbers";
        System.out.println("String = " + string2);
        char[] string2CharArray = string2.toCharArray();
        System.out.println("Print Char Array = " + Arrays.toString(string2CharArray));
        //char[] charArray = new char[str.length()];
        for(char c : string2CharArray) {
            System.out.print(c + " ");
        }


    }
}
