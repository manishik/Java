package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        int totalLength = 12; // Total length of the string
        int halfLength = totalLength / 2; // Half for numbers, half for letters
        System.out.println("Generated Random String: " + generateBalancedRandomString(halfLength));
    }

    public static String generateBalancedRandomString(int halfLength) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        Random random = new Random();
        ArrayList<Character> characters = new ArrayList<>();

        // Generate random letters
        for (int i = 0; i < halfLength; i++) {
            characters.add(letters.charAt(random.nextInt(letters.length())));
        }

        // Generate random numbers
        for (int i = 0; i < halfLength; i++) {
            characters.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        // Shuffle the combined list
        Collections.shuffle(characters);

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char ch : characters) {
            result.append(ch);
        }

        return result.toString();
    }
}