package com.javaInterview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] intArray = {3, 1, 4, 5, 1, 3};
        int target = 6;

        int[] result = findTwoSum(intArray, target);

        if (result != null) {
            System.out.printf("Indices of numbers that add up to %d are: [%d, %d]%n", target, result[0], result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }

        // Another simpler way
        /*
        Complexity:
		    Time Complexity: O(n^2) due to the nested loops.
		    Space Complexity: O(1), as no additional data structures are used.
         */
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] + intArray[j] == target) {
                    System.out.printf("Simpler: Indices of numbers that add up to %d are: [%d, %d]%n", target, i, j);
                    System.out.println("Numbers that add up to = " + target + " are " + intArray[i] + " & " + intArray[j]);
                    return;
                }
            }
        }
        System.out.println("No two numbers found that add up to the target.");
    }

    /*
    Complexity:
	    Time Complexity: O(n), as each element is processed at most twice (once during the iteration and once during the containsKey check).
	    Space Complexity: O(n), for the HashMap.
     */
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null; // Return null if no pair is found
    }

}
