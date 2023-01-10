package com.javaInterview.basics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class AddBigIntegersAndDecimals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number");
		BigInteger a = scan.nextBigInteger();
		System.out.println("Input another number");
		BigInteger b = scan.nextBigInteger();;
		BigInteger sum = a.add(b);
		System.out.println("Sum of 2 given number = " + sum);

		System.out.println("Input a BigDecimal");
		BigDecimal bigDecimal = scan.nextBigDecimal();
		System.out.println("Input another BigDecimal");
		BigDecimal bigDecimal1 = scan.nextBigDecimal();
		BigDecimal sumBigDecimal = bigDecimal.add(bigDecimal1);
		System.out.println("Sum of 2 given BigDecimals is = " + sumBigDecimal);

	}

}
