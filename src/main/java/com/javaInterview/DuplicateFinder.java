package com.javaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 3, 6, 7, 7);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n)) // add() returns false if element already exists
                .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
    }
}
