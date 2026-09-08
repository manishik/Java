package com.javaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 2, 4, 3, 6, 7, 7);

        System.out.println("List: " + integerList);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer number : integerList) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Duplicates: " + duplicates);
        System.out.println("List without Duplicates: " + seen);
    }
}
