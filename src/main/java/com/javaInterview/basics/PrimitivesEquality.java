package com.javaInterview.basics;

public class PrimitivesEquality {

	int a = 10, b = 20, c = 30, d = c;

	public static void main(String[] args) {

		PrimitivesEquality primitivesEquality = new PrimitivesEquality();
		if (primitivesEquality.a == primitivesEquality.b) {
			System.out.println("Is " + primitivesEquality.a + " == " + primitivesEquality.b + " ??  Answer = "  + "Equal");
		} else {
			System.out.println("Is " + primitivesEquality.a + " == " + primitivesEquality.b + " ??  Answer = "  + "Unequal");
		}

		if (primitivesEquality.c == primitivesEquality.d) {
			System.out.println("Is " + primitivesEquality.c + " == " + primitivesEquality.d + " ??  Answer = "  + "Equal");
		} else {
			System.out.println("Is " + primitivesEquality.c + " == " + primitivesEquality.d + " ??  Answer = "  + "Unequal");
		}
	}
}
