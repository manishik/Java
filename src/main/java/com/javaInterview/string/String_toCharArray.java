package com.javaInterview.string;

public class String_toCharArray {

	public static void main(String[] args) {

		String string = "Test String";

		System.out.println("String  = " + string);

		char charArray[] = new char[string.length()];
		/*for (int i = 0; i < string.length(); i++) {
			charArray[i] = string.charAt(i);
			//System.out.println(charArray[i]);
		}*/

		System.out.print("Array = ");
		//Print the Character Array  
		for (int j = 0; j < charArray.length; j++) {
			System.out.print(charArray[j]);
		}

		System.out.println();
		
		char aCharArray[] = string.toCharArray();
		System.out.print("Array = ");
		System.out.println(aCharArray);
		System.out.println("Array Length = " + aCharArray.length);
	}
}
