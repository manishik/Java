package com.javaInterview;

public class IntNumberReverse {

    public static void main(String[] args) {
        IntNumberReverse test = new IntNumberReverse();
        int result = test.Solution(674895434);
        System.out.println("Reverse Number: " + result);

        // reversing using StringBuilder
        int someInt = 545645652;
        System.out.println("Some integer : " + someInt);
        StringBuilder stringBuilder = new StringBuilder(someInt + "");
        System.out.println("Reversed integer = " + Integer.parseInt(String.valueOf(stringBuilder.reverse())));

        String revresedString = stringBuilder.reverse().toString();
        System.out.println("Reversed String : " + revresedString);
    }

    public int Solution(int number) {
        System.out.println("Original Number: " + number);
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber * 10 + (number % 10);
            number = number / 10;
        }
        return reverseNumber;
    }



}
