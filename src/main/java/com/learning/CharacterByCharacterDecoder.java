package com.learning;

import java.util.Base64;

public class CharacterByCharacterDecoder {
    // Define the possible character set (lowercase letters and digits)
    private static final String CHARSET = "abcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String[] args) {
        // Example of an encoded password (Base64 encoded string)
        String encodedPassword = "cGFzc3dvcmQxMjM="; // This is "password123" encoded in Base64

        // Decode the password to match against
        String decodedPassword = new String(Base64.getDecoder().decode(encodedPassword));

        // Attempt to find the password by matching each character
        findPassword(decodedPassword);
    }

    // Method to find the password by matching characters one by one
    public static void findPassword(String targetPassword) {
        StringBuilder foundPassword = new StringBuilder();

        // Iterate through each character in the target password
        for (int i = 0; i < targetPassword.length(); i++) {
            // Try to match each character by brute-forcing through the charset
            char foundChar = matchCharacter(i, targetPassword);
            foundPassword.append(foundChar);
            System.out.println("Character " + (i + 1) + " found: " + foundChar);
        }

        System.out.println("Password found: " + foundPassword.toString());
    }

    // Method to match a character at a specific position
    public static char matchCharacter(int position, String targetPassword) {
        // Try every character in the charset until we find a match
        for (char candidateChar : CHARSET.toCharArray()) {
            if (candidateChar == targetPassword.charAt(position)) {
                return candidateChar; // Return the matching character
            }
        }
        throw new IllegalStateException("No matching character found, which shouldn't happen.");
    }
}

