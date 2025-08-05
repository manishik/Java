package com.javaInterview.sort_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SearchTest {
    public static void main(String args[]) {
        String[] simpsons = {"Bart", "Hugo", "Lisa", "Marge", "Homer",
				"Manish Keshav", "Roy"};

        // Convert to stringArrayList
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(simpsons));

        // Ensure stringArrayList is sorted
        Collections.sort(stringArrayList);
        System.out.println("Sorted stringArrayList: [length: " + stringArrayList.size() + "]");
        System.out.println(stringArrayList);

        // Search for element in stringArrayList
        int index = Collections.binarySearch(stringArrayList, "Manish Keshav");
        System.out.println("Found Manish Keshav @ " + (index + 1));

        // Search for element not in stringArrayList
        index = Collections.binarySearch(stringArrayList, "Jimbo Jones");
        System.out.println("Didn't find Jimbo Jones @ " + index);

        // Insert
        int newIndex = -index - 1;
		System.out.println("newIndex = " + newIndex);
        stringArrayList.add(newIndex, "Jimbo Jones");
        System.out.println("With Jimbo Jones added: [length: " + stringArrayList.size()
                + "]");
        System.out.println(stringArrayList);
    }
}
