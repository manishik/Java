package com.javaInterview.sort_search.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortStreams {

    public static void main(String[] args) {
        //List<Integer> numbers = Arrays.asList(38, 27, 43, 3, 9, 82, 10, -10, 0, -44);
        List<Integer> numbers = Arrays.asList(4, 1, 5, 3, 2);
        numbers.add(3);
        System.out.println("Original List: " + numbers);
        List<Integer> sortedList = mergeSort(numbers);
        System.out.println("Sorted List: " + sortedList);
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list; // Base case
        }
        int mid = list.size() / 2;
        // Recursively split using subList and sort each half
        List<Integer> left = mergeSort(list.subList(0, mid));
        List<Integer> right = mergeSort(list.subList(mid, list.size()));
        // Merge and return
        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        // Merge two sorted lists
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }
        // Add remaining elements
        merged.addAll(left.subList(i, left.size()));
        merged.addAll(right.subList(j, right.size()));
        return merged;
    }
}
