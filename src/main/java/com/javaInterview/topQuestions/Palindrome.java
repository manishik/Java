package com.javaInterview.topQuestions;

import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {
        int intArray[] = new int[]{1, 2, 3, 2, 1, 4};
        String[] strArray = new String[]{"Manish", "Indudhar", "Keshav", "Indudhar", "Manish"};
        char charArray[] = new char[]{'b', 'a', 'z', 'a', 'b'};
        System.out.println("Is this int/String array " + Arrays.toString(intArray) + " a Palindrome?");
        if (isPalindrome(intArray)) {
            System.out.println("Yes a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        String str = "ManishsinaM";
        System.out.println("Is this String " + str + " a Palindrome? ");
        if (isPalindromeStr(str)) // True
            System.out.print("Yes, " + str + " is a Palindrome");
        else
            System.out.print("No, " + str + " is not a Palindrome");
    }

    static boolean isPalindrome(int[] array) {
        boolean palindrome = false;
        //int i = array.length - 1;
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            /*System.out.println("i = " + array[i]);
            System.out.println("j = " + array[j]);*/
            if (array[i] == array[j]) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }

    static boolean isPalindrome(String str) {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    public static boolean isPalindromeStr(String str) {
        // Normalize the string: Remove spaces and convert to lowercase
        //String normalized = str.replaceAll("\\s", "").toLowerCase();
        String normalized = str.replaceAll("\\s", "");

        // Reverse the string and compare with the original
        String reversed = new StringBuilder(normalized).reverse().toString();

        System.out.println("true or false ?? : " + normalized.equalsIgnoreCase(reversed));
        //return normalized.equals(reversed);
        return normalized.equalsIgnoreCase(reversed);
    }

}
