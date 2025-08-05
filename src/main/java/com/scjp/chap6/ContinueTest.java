package com.scjp.chap6;

// Review Question 8. Designed to fail.

class ContinueTest {
	public static void main(String[] arg) {
		int i = 2;
		Outer: if (i < 5) {
			System.out.println("I: " + i);
			i++;
			// continue Outer; //Compiler Error
		}
	}
}
