package com.javaInterview.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOperations {


    public static void main(String[] args) {
        //int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println("Array Numbers: " + Arrays.toString(numbers));
        int[] arr = new int[]{1, 2, 3, 4, 2, 4};
        System.out.println("Array Numbers: " + Arrays.toString(arr));
        int first = arr[0];
        System.out.println("First element is: " + first);
        System.out.println("Second element is: " + arr[2]);
        arr[1] = 99;
        System.out.println("Array Length = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();

        System.out.println("Array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Sorting int array in reverse order
        int[] reveredSortedArr = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println("Revered Sorted Array: " + Arrays.toString(reveredSortedArr));

        System.out.println();
        Integer[] array = {5, 2, 9};
        System.out.println("Integer Array Elements: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array Elements: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder()); // reverseOrder() works with Integer[], not primitive int[].
        System.out.println("Reverse Sorted Integer Array: " + Arrays.toString(array));

        int index = Arrays.binarySearch(arr, 99); // Array must be sorted.
        System.out.println("Index: " + index);

        //Stream Operations on Array
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum: " + sum);

        double avg = Arrays.stream(arr).average().orElse(0);
        System.out.println("Avg: " + avg);

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max: " + max);
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min: " + min);

        System.out.print("Even Numbers in the Array: ");
        Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(System.out::println);

        int[] doubled = Arrays.stream(arr).map(n -> n * 2).toArray();
        System.out.println("Doubled: " + Arrays.toString(doubled));

        int[] unique = Arrays.stream(arr).distinct().toArray();
        System.out.println("Unique Elements in Array : " + Arrays.toString(unique));

        long count = Arrays.stream(arr).filter(n -> n < 10).count();
        System.out.println("Count of elements <10 : " + count);

        //Convert Array to List
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println("List of Integers: " + list);

        //
        List<Integer> list1 = Arrays.asList(1, 2, 3, 0, -1, -11, 99, 10);
        int[] arrr = list1.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Array Elements: " + Arrays.toString(arrr));
    }

}
