package com.javaInterview;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};

        int target = 6;

        int result[] = twoSum(nums,target);

        //System.out.println(Arrays.toString(result));
        //Arrays.asList(result).stream().forEach(s -> System.out.println(s));
        //Stream.of(result).forEach(System.out::println);
        Arrays.stream(result).forEach(System.out::println);


        /*Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            map.put(nums[i], i);
        }

        for (Map.Entry<Integer, Integer> mapp : map.entrySet()) {
            mapp.getKey();

        }*/

        /*for (int i = 0; i < nums.length-1; i++) {
            System.out.println(nums[i]);

            if(nums[i] + nums[i+1] == target){
                System.out.println("Inside");
            }
        }*/
    }

    public static int[] twoSum(int[] nums, int target) {
        // inserted Value & Indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Filling the HashMap
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        // Searching for the target indices
        for(int i = 0; i < nums.length; i++){
            // I will get my first element Example:- [2,7,11,15], target = 9
            int num = nums[i]; // I will get 2
            int rem = target - num; // Calculating remaining value = 9 - 2 = 7 will get from here
            if(map.containsKey(rem)){ // Now I will check is on any index 7 present.
                int index = map.get(rem); // From here i will get the index for no. 7
                if(index == i) continue; // By doing this i will handle the case to not select more then one of yourself.
                return new int[]{i, index}; // returning the array with their indices.
            }
        }
        return new int[]{}; // If we unable to found return empty array.
    }

}
