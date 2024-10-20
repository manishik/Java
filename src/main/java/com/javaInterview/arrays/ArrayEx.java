package com.javaInterview.arrays;

import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {
        String[] array = new String[] {"John", "Mary", "Bob"};
        System.out.println("array = " + Arrays.toString(array));

        String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
        System.out.println(Arrays.toString(deepArray));
        //output: [[Ljava.lang.String;@106d69c, [Ljava.lang.String;@52e922]
        System.out.println(Arrays.deepToString(deepArray));

        int[] intArray = { 7, 9, 5, 1, 3 };
        System.out.println(Arrays.toString(intArray));

    }

}
