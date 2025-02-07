package com.learning;

import java.util.Scanner;

public class PasswordHack {

    public static void main(String[] args) {

        char[] smallAlphabets = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println(smallAlphabets);

        /*String password = "something";

        char[] pwdArray = password.toCharArray();

        for (char pc : pwdArray) {
            for (char sa : smallAlphabets) {
                if (pc == sa) {


                }

            }
        }*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int passwordLength = password.length();
        int characterSetSize = calculateCharacterSetSize(password);

        double entropy = passwordLength * (Math.log(characterSetSize) / Math.log(2));

        System.out.printf("Password Length: %d%n", passwordLength);
        System.out.printf("Character Set Size: %d%n", characterSetSize);
        System.out.printf("Password Entropy: %.2f bits%n", entropy);

        scanner.close();

    }

    private static int calculateCharacterSetSize(String password) {
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigits = false;
        boolean hasSymbols = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigits = true;
            } else {
                hasSymbols = true;
            }
        }

        int characterSetSize = 0;
        if (hasLower) characterSetSize += 26;   // a-z
        if (hasUpper) characterSetSize += 26;   // A-Z
        if (hasDigits) characterSetSize += 10;  // 0-9
        if (hasSymbols) characterSetSize += 32; // Common printable symbols

        return characterSetSize;
    }


}
