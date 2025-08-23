package com.javaInterview.basics;

import java.util.ArrayList;

public class Division {

	public static void main(String[] args) {
		int number = 1234567890;
		int sumTotal = 0;

		System.out.println("Number = " + number);
		// Converting int number to ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		do {
			//System.out.println("Remainder = " + number % 10);
			arrayList.add(number % 10); // % gets the remainder
			sumTotal = sumTotal + (number % 10);
			number = number / 10; // / gets the quotient
			//System.out.println("Quotient = " + number);
		} while (number > 0);

		System.out.println("ArrayList from Number = " + arrayList);
		System.out.println("ArrayList total = " + sumTotal);

		// Collections.reverse(arrayList); //Same reversing below

		ArrayList<Integer> reverseArrayList = new ArrayList<Integer>();
		for (int i = arrayList.size() - 1; i >= 0; i--) {
            reverseArrayList.add(arrayList.get(i));
		}

		System.out.println("Reverse ArrayList = " + reverseArrayList);

		// converting ArrayList to int array
		int[] intArray = new int[reverseArrayList.size()];
		int i = 0;
		for (Integer in : reverseArrayList) {
            intArray[i++] = in;
		}

        System.out.print("int Array = ");
		for (int a : intArray) {
			System.out.print(a + " ");
		}

	}

}
