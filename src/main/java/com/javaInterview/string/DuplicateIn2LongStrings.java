package com.javaInterview.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateIn2LongStrings {

    public static void main(String[] args) {
        // Input strings
        String str1 = "programming is hard to learn";
        String str2 = "java programmer/developer are the best and are hard to evaluate";

        // Find duplicates
        Set<String> duplicates = findDuplicates(str1, str2);

        // Print results
        System.out.println("Duplicates: " + duplicates);
    }

    public static Set<String> findDuplicates(String str1, String str2) {
        // Convert strings to lowercase to make the search case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Create sets to store characters
        Set<String> set1 = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        String[] string1Array = str1.split(" ");
        String[] string2Array = str2.split(" ");

        for(String str : string1Array) {
            set1.add(str);
        }
        for(String str : string2Array) {
            if(set1.contains(str)) { // duplicates found
                duplicates.add(str);
            }
        }
        return duplicates;
    }


}
