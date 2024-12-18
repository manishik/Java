package com.javaInterview.arrays;

public class RevIntArray {

    public static void main(String[] args) {
        int[] intArray = new int[]{4, -1, -2, 3, 5, 0};
        char[] charArray = {'a', 'b', 'n', 'c', 'm', 'd', 'z'};

        System.out.println("int Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        int[] b = new int[intArray.length];
        char[] rev = new char[charArray.length];

        int j = 0;
        for (int i = intArray.length - 1; i >= 0; i--) {
            b[j] = intArray[i];
            j++;
        }
        System.out.println();
        System.out.println("b[j]");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();

        System.out.println(charArray);

        System.out.println("Reversed Characters : ");
        int m = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            rev[m] = charArray[i];
            m++;
        }
        for (char c : rev) {
            System.out.print(c + " ");
        }


    }

}
