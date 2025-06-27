package com.javaInterview.string;

import java.util.*;

public class DeleteDupWords {

    public static void main(String[] args) {

        String str = "This is to to test to make sure in that the test is duplicates in this sentence are are that removed !";

        String[] words = str.split(" ");

        Set nonDuplicatesWords = new LinkedHashSet();
        for (String word : words) {
            nonDuplicatesWords.add(word);
        }
        System.out.println("Non duplicates words set are: " + nonDuplicatesWords);

        Map<String, Integer> wordCounter = new LinkedHashMap();
        for (String word : words) {
            Integer counter = wordCounter.get(word);
            if (counter == null) {
                wordCounter.put(word, 1);
            } else  {
                wordCounter.put(word, counter + 1);
            }
        }
        System.out.println("Counter Map are: " + wordCounter);
    }
}
