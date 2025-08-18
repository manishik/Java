package com.javaInterview.sort_search.searches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SearchTest {
    public static void main(String args[]) {
        String[] strArray = {"Roy", "Hugo", "Marge", "Homer",
                "Manish Keshav", "Lisa", "Bart"};

        System.out.println("Original Array: " + Arrays.toString(strArray));

        // Convert to stringArrayList
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(strArray));

        // Ensure stringArrayList is sorted
        Collections.sort(stringArrayList);
        System.out.println("Sorted stringArrayList: [length: " + stringArrayList.size() + "]");
        System.out.println("Sorted ArrayList = " + stringArrayList);

        // Search for element in stringArrayList
        int index = Collections.binarySearch(stringArrayList, "Manish Keshav");
        System.out.println("Found Manish Keshav @ " + (index));

        // Search for element not in stringArrayList
        index = Collections.binarySearch(stringArrayList, "Jimbo Jones");
        System.out.println("Didn't find Jimbo Jones @ " + index);

        // Insert
        int newIndex = -index - 1;
        System.out.println("newIndex = " + newIndex);
        stringArrayList.add(newIndex, "Jimbo Jones");
        System.out.println("With Jimbo Jones added: [length: " + stringArrayList.size()
                + "]");
        System.out.println("New Array List = " + stringArrayList);
    }
}
