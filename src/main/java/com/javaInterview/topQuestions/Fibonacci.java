package com.javaInterview.topQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws IOException {
		long number;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number\n");
		number = Long.parseLong(br.readLine());
		 fibo(number); // using recursion
		// fibonacci(number); // using iterative
	}

	static long i1 = 0;
	static long	i2 = 1;
	static long i3 = 1;

	// using iterative
	static void fibonacci(long number) {
		System.out.println();
		System.out.print(i1 + " " + i2 + "  ");
		for (long i = 0; i <= number; i++) {
			i = i1 + i2;
			System.out.print(i + "  ");
			i1 = i2;
			i2 = i;
		}
	}

	// using recursion
	static long fibo(long number) {
		if (number >= i3) {
			System.out.print(i3 + "   ");
			i3 = i1 + i2;
			i1 = i2;
			i2 = i3;
			return (fibo(number));
		} else {
			return (1);
		}
	}

}
