package com.javaInterview.string;

public class StrMatches {

	public static void main(String[] args) {
		String s1 = "Manish";
		String s2 = "ManisH";
		String s3 = "Nandini";
		String s4 = "Nandini";
		System.out.println("String created with just assigning values");
		System.out.println(s1 + " matches " + s2 + " = " + s1.matches(s2));
		System.out.println(s3 + " matches " + s4 + " = " + s3.matches(s4));
		
		String s5 = new String("Nandini");
		String s6 = new String("NandinI");

		String s7 = new String("ManishKI11");
		String s8 = new String("ManishKI11");

		System.out.println();
		System.out.println("String created with new keyword");
		System.out.println(s5 + " matches " + s6 + " = " + s5.matches(s6));
		System.out.println(s7 + " matches " + s8 + " = " + s7.matches(s8));
		
	}
}
