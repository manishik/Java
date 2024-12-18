package com.javaInterview.interviewQs;

public class MaxOnesBetweenZeros {

    public static void main(String[] args) {
        int number = 1011110010; // count max 1's between 2 zero's
        // Int to Int array
        int[] digits = Integer.toString(number).chars().map(c -> c - '0').toArray();

        System.out.println();
        System.out.println("Number = " + number);

        //System.out.println("Max One Count = " + findMaxConsecutiveOnes(digits));
        System.out.println("Max One Count = " + maxOnesBetweenZeros(digits));
    }

    // From Internet
    public static int maxOnesBetweenZeros(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : arr) {
            if (num == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }

        // Check for the last sequence of 1s (May be not needed since the last digit is assumed 0)
        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
    }

    // Solved
    static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int counter = 0, max = Integer.MIN_VALUE;
        System.out.println("Max = " + max);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter = counter + nums[i];
            } else {
                counter = nums[i];
            }
            max = Math.max(counter, max);
        }
        return max;
    }

}
