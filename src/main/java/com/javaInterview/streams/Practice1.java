package com.javaInterview.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Apple", "Orange", "banana", "APPLE", "apple");

        // Oct 5th Interview with Mphasis
        // Given a list of strings, count how many times each word appears (case-insensitive) using Java 8 streams.
        Map<String, Long> wordCount = words.stream()
                //.map(String::toLowerCase) //Skipping this step will make (case-sensitive)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);

        Stream<String> list = words.stream().distinct();
        System.out.println(list.collect(Collectors.toList()));
    }
}
