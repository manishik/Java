package com.javaInterview.interviewQs;

public class I1 {

    public static void main(String[] args) {
        int number = 1011101011; // count max 1's between 2 zero's
        String str = Integer.toString(number);

        // Int to Int array
        int[] digits = Integer.toString(number).chars().map(c -> c - '0').toArray();

        for (int d : digits)
            System.out.print(d);

        System.out.println();
        System.out.println("Number = " + number);

        System.out.println("Max One Count = " + cal(str));
        //System.out.println("Max One Count = " + findMaxConsecutiveOnes(digits));
    }

    //1011101011
    //Need continous count of max 1
    //Unsolved - below method
    static int cal(String string) {
        int oneCounter = 0;
        //int [] maxCount = {};
        //System.out.println("length = " + string.length());
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '1') {
                //System.out.println("1");
                oneCounter++;
            } else {
                //System.out.println("0");
                oneCounter = 0;
            }
			//maxCount[i] = oneCounter;
            //maxCount = Math.max(maxCount, 0);
        }
        return oneCounter;
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
                //System.out.println(counter);
            } else {
                //System.out.println("Else");
                counter = nums[i];
            }
            max = Math.max(counter, max);
        }
        return max;
    }

}
