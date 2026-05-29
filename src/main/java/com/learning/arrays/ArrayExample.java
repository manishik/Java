package com.learning.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ArrayExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Array with duplicate elements
        Integer[] origArray = new Integer[]{1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8, 8, 3, 3, 0};

        // This array has duplicate elements
        System.out.println("Array = " + Arrays.toString(origArray));

        Set<Integer> set = removeDuplicates(origArray);

        // Verify the content
        System.out.println("Unique Elements in the Array = " + set);

        Arrays.stream(origArray).filter(Objects::nonNull).distinct().forEach(System.out::print);
    }

    private static Set<Integer> removeDuplicates(Integer[] origArray) {
        Set<Integer> setOfIntegers = new HashSet<>(Arrays.asList(origArray));
        for (int i = 0; i < origArray.length - 1; i++) {
            if (origArray[i] == origArray[i + 1]) {
                origArray[i] = null;
                setOfIntegers.add(origArray[i + 1]);
            }
        }
        return setOfIntegers;
    }
}
