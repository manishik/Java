package com.learning.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dups {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        List<Integer> listOfIntegers = Arrays.asList(new Integer[]{1, 2, 1, 3, 4, 4});
		System.out.println("Original list of Integers = " + listOfIntegers);

		System.out.println("Duplicates = ");
        listOfIntegers.stream().filter(i -> Collections.frequency(listOfIntegers, i) > 1).collect(Collectors.toSet())
                .forEach(System.out::println);

        removeDups();

        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array Without Duplicates: " + Arrays.toString(uniqueArray));
    }

    static void removeDups() {
        Integer[] numbers = new Integer[]{1, 2, 1, 3, 4, 4};
		System.out.println("Original Integer Array = " + Arrays.toString(numbers));
        Set<Integer> allSetIntItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers).filter(n -> !allSetIntItems.add(n)).collect(Collectors.toSet()); // item was already in the set.
        System.out.println("Duplicates = " + duplicates); // [1, 4]
    }

    private static int[] removeDuplicates(int[] array) {
        return IntStream.of(array).distinct().toArray();
    }

}
