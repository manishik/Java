package com.javaInterview.sort_search.sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaDefaultSorts {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(1, 1, 92, -2, -2, 46, 5, 5, 0, 7, 4, 4, -44, 55, 55, 8, -5, -77, -9, 10, 10, 12, 12);
        System.out.println("Number List = " + numbersList);

        Collections.sort(numbersList);
        System.out.println("Sorted Number List = " + numbersList);

        Collections.sort(numbersList, Collections.reverseOrder());
        System.out.println("Reverse Sorted Number List = " + numbersList);

        List<Integer> anotherNumbersList = Arrays.asList(1, 92, -2, 0, 5, -9, 12, 10, 3, -3, 988, 4);
        System.out.println("Another Number List = " + anotherNumbersList);

        // (Sort elements using Streams)
        System.out.println("Sorted Number List = " + anotherNumbersList.stream().sorted().collect(Collectors.toList()));
        System.out.println("Sorted Number List (Reversed) = " + anotherNumbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

    }
}
