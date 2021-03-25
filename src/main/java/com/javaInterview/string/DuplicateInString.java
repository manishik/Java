package com.javaInterview.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInString {

    public static void main(String[] args) {

        String string = "Apple";

        char[] charArray = string.toCharArray();
        Map<Character, Integer> characterHashMap = new HashMap<Character, Integer>();
        int count = 0;

        // checking each char of strArray
        for (char c : charArray) {
            if (characterHashMap.containsKey(c)) {
                // If char is present in charCountMap,
                // incrementing it's count by 1
                characterHashMap.put(c, characterHashMap.get(c) + 1);
            } else {
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                characterHashMap.put(c, 1);
            }
        }
        System.out.println(characterHashMap);
    }

}
