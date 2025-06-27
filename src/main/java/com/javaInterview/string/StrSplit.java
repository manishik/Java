package com.javaInterview.string;

public class StrSplit {

	public static void main(String[] args) {

		String str = "Manish_is_a_Great_Developer_Of_Java_Programming_Language";

		String strArray[] = str.split("_");

		// System.out.println("First Element = "+s2[0]);
		// System.out.println("Second Element = "+s2[1]);

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(" " + strArray[i]);
		}

		System.out.println();
		for (String str1 : strArray) {
			System.out.print(str1+" ");
		}

	}

}
