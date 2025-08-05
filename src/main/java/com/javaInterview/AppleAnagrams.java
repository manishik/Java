package com.javaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppleAnagrams {

    public static void main(String[] args) {
        String[] stringArray = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Create a map to hold groups of anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : stringArray) {
            // Convert the string to a char array, sort it and then convert back to a string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the original string to the corresponding list in the map
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(str);
        }

        // Prepare the output in the required format
        List<List<String>> result = new ArrayList<>(anagramMap.values());

        // Print the result
        System.out.println(result);


        /*List<List<String>> result1 = groupAnagrams1(stringArray);
        System.out.println(result1);*/
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        // Use a stream to process the array and group anagrams
        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> {
                    // Sort each string and use it as the key for grouping
                    char[] chars = s.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);  // Sorted string becomes the key
                }))
                .values()
                .stream()
                .collect(Collectors.toList());  // Convert map values to a List of Lists
    }
    //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public static List<List<String>> groupAnagrams1(String[] strs) {
        // Create a map to store lists of anagrams, with the sorted string as the key
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Loop through each string in the array
        for (String str : strs) {
            // Convert the string to a character array, sort it, and then convert it back to a string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // Add the original string to the corresponding anagram group
            anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        // Return all values from the map as a list of lists
        return new ArrayList<>(anagramGroups.values());
    }

}
