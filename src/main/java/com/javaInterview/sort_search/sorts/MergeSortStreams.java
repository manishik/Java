package com.javaInterview.sort_search.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortStreams {

    public static void main(String[] args) {
        //List<Integer> numbers = Arrays.asList(38, 27, 43, 3, 9, 82, 10, -10, 0, -44);
        List<Integer> numbers = Arrays.asList(4, 8, 0, 7, 9, 2, 6, 3, 1, 5);
        System.out.println("Original List: " + numbers);
        List<Integer> sortedList = mergeSort(numbers);
        System.out.println("Sorted List: " + sortedList);
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list; // Base case
        }
        int middle = list.size() / 2;
        // Recursively split using subList and sort each half
        List<Integer> leftList = mergeSort(list.subList(0, middle));
        List<Integer> rightList = mergeSort(list.subList(middle, list.size()));
        // Merge and return
        return merge(leftList, rightList);
    }

    private static List<Integer> merge(List<Integer> leftList, List<Integer> rightList) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        // Merge two sorted lists
        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i) <= rightList.get(j)) { // Sorting ascending (<) or descending (>) order
                mergedList.add(leftList.get(i++));
            } else {
                mergedList.add(rightList.get(j++));
            }
        }
        // Add remaining elements
        mergedList.addAll(leftList.subList(i, leftList.size()));
        mergedList.addAll(rightList.subList(j, rightList.size()));
        return mergedList;
    }
}
