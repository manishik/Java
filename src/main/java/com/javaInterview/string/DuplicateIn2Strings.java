package com.javaInterview.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateIn2Strings {

    public static void main(String[] args) {
        // Input strings
        String str1 = "programming";
        String str2 = "developer";

        // Find duplicates
        Set<Character> duplicates = findDuplicates(str1, str2);

        // Print results
        System.out.println("Duplicates: " + duplicates);
    }

    public static Set<Character> findDuplicates(String str1, String str2) {
        // Convert strings to lowercase to make the search case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Create sets to store characters
        Set<Character> set1 = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        // Add characters from the first string to the set
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        // Check for common characters in the second string
        for (char c : str2.toCharArray()) {
            if (set1.contains(c)) {
                duplicates.add(c);
            }
        }

        return duplicates;
    }


}
