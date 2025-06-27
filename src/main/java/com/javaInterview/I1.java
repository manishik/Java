package com.javaInterview;

import java.util.HashMap;
import java.util.Map;

public class I1 {

    public static void main(String[] args) {
        // Use a map to count characters
        Map<Character, Integer> charCountMap = new HashMap<>();

        String input = "abccccccddeee";

        // Loop through characters
        for (char ch : input.toCharArray()) {
            // You can ignore spaces if needed using: if (ch == ' ') continue;
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Display results
        System.out.println("\nCharacter Count and Square:");
        /*for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            int count = entry.getValue();
            int square = count * count;
            System.out.println("Character '" + entry.getKey() + "' -> Count: " + count + ", Square: " + square);
        }*/

        charCountMap.forEach((key, value) ->
            {
                int valueSquare =  value * value;
                System.out.println("Character '" + key +  "  Value Square: " + valueSquare);
            }
        );
    }
}