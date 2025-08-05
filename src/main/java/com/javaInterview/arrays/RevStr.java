package com.javaInterview.arrays;

import java.util.stream.Stream;

public class RevStr {

	public static void main(String[] args) {
		String string = "Manish Keshav";

		//Convert string to character array & print character array using steams/lambda expression
		char charArray[];
		charArray= string.toCharArray();
		Stream.of(charArray).map(String::valueOf).forEach(System.out::println);

		int j = 0;
		for (int i = string.length() - 1; i >= 0; i--) {
			charArray[j] = string.charAt(i);
			j++;
		}

		//Print character array - simple way
		/*for (char c : charArray) {
			System.out.print(c);
		}*/

		//Print character array using streams/lambda expression
		Stream.of(charArray).map(String::valueOf).forEach(System.out::println);

	}

}
