package com.javaInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RotateAndSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        String[] arrtempItems = bufferedReader.readLine().trim().split("\\s+");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrtempItems[i]);
            arr.add(arrItem);
        }

        int outcome = Outcome.solve(arr);
        System.out.println(outcome);
        bufferedReader.close();
    }

}

class Outcome {

    /*
     * Implement method/function with name 'solve' below.
     * The function accepts following as parameters.
     *  1. arr is of type List<Integer>.
     * return int.
     */

    // Return the maximum value of sum(i * arr[i]) across all right rotations.
    public static int solve(List<Integer> arr){
        if (arr == null || arr.isEmpty()) {
            return 0;
        }

        int total = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
            currentSum += i * arr.get(i);
        }

        int maximumSum = currentSum;
        for (int rotation = 1; rotation < arr.size(); rotation++) {
            int movedElement = arr.get(arr.size() - rotation);
            currentSum = currentSum + total - arr.size() * movedElement;
            maximumSum = Math.max(maximumSum, currentSum);
        }
        return maximumSum;
    }

}
