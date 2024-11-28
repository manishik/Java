package com.javaInterview.basics;

public class RememberDeclarations {

    String[] stringArray = new String[]{"John", "Mary", "Bob"};
    String stringArray1[] = {"John", "Mary", "Bob"};

    int[] intArray = {7, 9, 5, 1, 3};
    int intArray1[] = new int[]{1, 5, -3, 11, 2, 6, 1, 10};
    Integer[] integerArray = new Integer[]{1, 2, 3, 9, 9, 8, 7};
    Integer integerArray1[] = {1, 2, 3, 9, 9, 8, 7};


    void aMethod() {
        String str = "MyString has spaces and 123 numbers";
        char charArray[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
    }

}
