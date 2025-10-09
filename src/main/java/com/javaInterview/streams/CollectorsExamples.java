package com.javaInterview.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExamples {

    public static void main(String[] args) {

        double avg = Stream.of(10, 20, 30).collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Avg = " + avg);

        long count = Stream.of("A", "B", "C").collect(Collectors.counting());
        System.out.println("Count = " + count);

        Map<Boolean, List<Integer>> partitioned =
                Stream.of(1, 2, 3, 4, 5)
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Partitioned = " + partitioned);

        //Counts how many even/odd numbers
        Map<Boolean, Long> countByParity =
                Stream.of(1, 2, 3, 4, 5)
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));
        System.out.println("CountByParity = " + countByParity);

        IntSummaryStatistics stats = Stream.of(10, 20, 30)
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Sum = " + stats.getSum());

        int total = Stream.of(1, 2, 3, 4)
                .collect(Collectors.reducing(0, Integer::sum));
        System.out.println("Total = " + total);


        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        String upperNames = words.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.joining(", "),
                        String::toUpperCase
                ));
        System.out.println("Upper Names = " + upperNames);

        Map<Integer, Set<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toCollection(TreeSet::new)
                ));
        System.out.println("Grouped = " + grouped);

        // Find the longest word
        Optional<String> longestWord = words.stream()
                .max(Comparator.comparingInt(String::length));

        longestWord.ifPresent(word -> System.out.println("Longest word: " + word)); // Output: Longest word: banana

        // Find the word that comes last alphabetically
        Optional<String> lastAlphabeticalWord = words.stream()
                .max(Comparator.naturalOrder());

        lastAlphabeticalWord.ifPresent(word -> System.out.println("Last alphabetical word: " + word)); // Output: Last alphabetical word: cherry

    }

}
