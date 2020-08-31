package com.javaInterview.string;

public class StrToCharArray {

	public static void main(String[] args) {

		String str = "Test String";

		System.out.println("String  = " + str);

		char charArray[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
			System.out.println(charArray[i]);
		}

		System.out.println("Array = ");
		//Print the Character Array  
		for (int j = 0; j < charArray.length; j++) {
			System.out.print(charArray[j]);
		}

		System.out.println();
		
		char aCharArray[] = str.toCharArray();
		System.out.println("Array = ");
		System.out.println(aCharArray);
		System.out.println("Array Length = " + aCharArray.length);
	}
}
