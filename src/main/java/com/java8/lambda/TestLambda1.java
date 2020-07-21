package com.java8.lambda;

//Java program to demonstrate lambda expressions to implement 
//a user defined functional interface. 

@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class TestLambda1 {
	public static void main(String args[]) {
		int a = 5;

		// lambda expression to define the calculate method
		Square square = (int b) -> b * b;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = square.calculate(a);
		System.out.println(ans);
	}
}
