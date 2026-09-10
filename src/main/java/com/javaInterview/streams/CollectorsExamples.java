package com.javaInterview.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsExamples {

    public static void main(String[] args) {

        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().toList();
        System.out.println("Number List = " + numbers);
        // Output: Number List = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

        double avg = Stream.of(10, 20, 30).collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Avg = " + avg);
        // Output: Avg = 20.0

        long count = Stream.of("AB", "B", "C").count();
        System.out.println("Count = " + count);
        // Output: Count = 3

        Map<Boolean, List<Integer>> partitioned =
                Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Partitioned = " + partitioned);
        // Output: Partitioned = {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 0]}

        //Counts how many even/odd numbers
        Map<Boolean, Long> countByParity =
                Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));
        System.out.println("CountByParity = " + countByParity);
        // Output: CountByParity = {false=5, true=4}

        IntSummaryStatistics stats = Stream.of(10, 20, 30)
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Sum = " + stats.getSum());
        // Output: Sum = 60

        int total = Stream.of(1, 2, 3, 4)
                .collect(Collectors.reducing(0, Integer::sum));
        System.out.println("Total = " + total);
        // Output: Total = 10


        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "pomegranate");

        String upperNames = words.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.joining(", "),
                        String::toUpperCase
                ));
        System.out.println("Upper Names = " + upperNames);
        // Output: Upper Names = APPLE, BANANA, CHERRY, DATE, POMEGRANATE

        Map<Integer, Set<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toCollection(TreeSet::new)
                ));
        System.out.println("Grouped = " + grouped);
        // Output: Grouped = {4=[date], 5=[apple], 6=[banana, cherry], 11=[pomegranate]}

        // Find the longest word
        Optional<String> longestWord = words.stream().max(Comparator.comparingInt(String::length));
        longestWord.ifPresent(word -> System.out.println("Longest word: " + word));
        // Output: Longest word: pomegranate

        // Find the word that comes last alphabetically
        Optional<String> lastAlphabeticalWord = words.stream()
                .max(Comparator.naturalOrder());

        lastAlphabeticalWord.ifPresent(word -> System.out.println("Last alphabetical word: " + word));
        // Output: Last alphabetical word: pomegranate


        // creating an Integer stream
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // using Collectors partitioningBy() method to split the stream of elements into 2 parts, greater than 3 and less than 3.
        Map<Boolean, List<Integer>> map = s.collect(Collectors.partitioningBy(num -> num > 3));

        // Displaying the result as a map true if greater than 3, false otherwise
        System.out.println("Elements in stream partitioned by less than equal to 3: \n" + map);
        // Output: Elements in stream partitioned by less than equal to 3:
        // {false=[1, 2, 3], true=[4, 5, 6, 7, 8, 9, 10]}

    }

}
