package com.javaInterview.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// parallelStream() enables concurrent processing, making it faster for large datasets.
// Use parallelStream() with reduce() for better performance on large datasets.

public class ParallelStreamExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 1000).parallel().sum();
        System.out.println("Sum: " + sum);

        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("NumbersList = " + numbersList);
        int sums = numbersList.parallelStream().reduce(0, Integer::sum); // Parallel reduction
        System.out.println("Parallel Sum: " + sums);

        // For large datasets, we can use parallelStream() to improve performance.
        List<Integer> doubledNumbers = numbersList.parallelStream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("DoubledNumbers = " + doubledNumbers);

    }

}
