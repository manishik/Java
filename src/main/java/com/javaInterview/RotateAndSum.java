package com.javaInterview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RotateAndSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_FILE_PATH")));
        bufferedWriter.write("\n");
        bufferedWriter.close();
        bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_FILE_PATH"), true));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        String[] arrtempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrtempItems[i]);
            arr.add(arrItem);
        }

        int outcome = Outcome.solve(arr);

        bufferedWriter.write(outcome + "\n");

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

class Outcome {

    /*
     * Implement method/function with name 'solve' below.
     * The function accepts following as parameters.
     *  1. arr is of type List<Integer>.
     * return int.
     */

    public static int solve(List<Integer> arr){
        //Write your code here
        //int incrementer = 0;
        int sum = 0;
        int result = 0, minimum = 0, rotation = 0;
        for(int i=0; i< arr.size();i++) {
            if(arr.get(i) >=1 && arr.get(i)<=50) {
                System.out.println("Arry = " +arr.get(i));
                result = sum * arr.get(i);
                sum = sum + 1;
                System.out.println("result = " +result);
                rotation = arr.get(i) + 1; //rotation

            }

            //incrementer = incrementer + 1;
        }
        return result; //return type "int".
    }

}