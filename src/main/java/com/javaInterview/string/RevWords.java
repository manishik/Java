package com.javaInterview.string;

public class RevWords {

    public static void main(String[] args) {

        String string = "Manish Indudhar is an Java Developer";

        String[] stringArray = string.split(" ");

        for (String s : stringArray) {
            System.out.print(s + " ");
        }

		System.out.println();
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i] + " ");
        }
    }

}
