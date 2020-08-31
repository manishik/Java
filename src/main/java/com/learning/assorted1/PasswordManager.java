package com.learning.assorted1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PasswordManager {

    public static void main(String[] args) {

        String complexPassword = "C0mpl3X M@n!y43e"; //Has Capital Letter, Small Letter, Number, Special Character and Space

        char[] charArray = complexPassword.toCharArray();

        System.out.println(complexPassword + " String converted to character array = " + Arrays.toString(charArray));

        String password1 = "G3@eks111";

        System.out.println(isValid(complexPassword));

    }

    public static String isValid(String password) {

        List<Integer> listOfDigits = new LinkedList<Integer>();

        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 10) && (password.length() <= 100))) {
            return "Password less than 10 chars";
        }

        // to check space
        /*if (password.contains(" ")) {
            return false;
        }*/

        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                char[] charArray = password.toCharArray();

                for (char aChar : charArray) {
                    //System.out.println("aChar = " + aChar);
                    System.out.println(aChar == i);
                    if (aChar == i) {
                        listOfDigits.add(i);
                    }
                }
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return "Password doesn't contain numbers";
            }
        }

        System.out.println("Digits = " + listOfDigits);

        // for special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return "Password doesn't contain special chars";
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char) i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return "Password doesn't contain capital letters";
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 90; i <= 122; i++) {

                // type casting
                char c = (char) i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return "Password doesn't contain small letters";
            }
        }

        // if all conditions fails
        return "Valid Password";
    }

    void method() {
        char[] capitalLettersArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] smallLettersArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int[] integersArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }

}


