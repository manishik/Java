package com.javaInterview.arrays;

import java.util.Arrays;

public class SortFibonacci {

    //Sort integer array fibonacci sequence by even numbers first without using another data structure

    public static void main(String[] args) {

        int[] fibArray = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418};

        //Remember to print an int array without iterating
        System.out.println(Arrays.toString(fibArray));

        int pos = 0, temp;
        for (int i = 0; i < fibArray.length; i++) {
            if (fibArray[i] % 2 == 0) {  // Even or Odd
                /*System.out.print(" fibArray[i]=" + fibArray[i] + " ");
                System.out.print(" fibArray[pos]=" + fibArray[pos] + " ");
                System.out.print("Position=" + i + " ");*/
                temp = fibArray[pos]; //first element to temp
                fibArray[pos] = fibArray[i]; //even number to first element
                fibArray[i] = temp; //temp to even number
                //System.out.print("Pos=" + pos + " ");
                pos++;
            }
        }
        //System.out.println();
        System.out.println(Arrays.toString(fibArray));
    }

}
