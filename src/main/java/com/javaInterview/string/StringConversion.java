package com.javaInterview.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringConversion {

	public static void main(String[] args) {
		String string = "100";
		
		System.out.println("String s1 = "+string);
		
		// parseShort converts String to short
		short s = Short.parseShort(string);
		System.out.println("String to short = " + s);
		
		// parseInt converts String to Integer
		int i = Integer.parseInt(string);
		System.out.println("String to int = " + i);
		
		// parseLong converts String to Long
		long l = Long.parseLong(string);
		System.out.println("String to long = " + l);
		
		// parseFloat converts String to Float
		float f = Float.parseFloat(string);
		System.out.println("String to float = " + f);
		
		// parseDouble converts String to Double
		double d = Double.parseDouble(string);
		System.out.println("String to double = " + d);

		// parseDouble converts String to Double
		double dd = Double.valueOf(string);
		System.out.println("dd = " + dd);
		
		int i1 = 200;
		// toString converts int to String
		String s2 = Integer.toString(i1);
		System.out.println("S2 = " + s2);

		// toString converts boolean to String
		boolean b1 = true;
		String s3 = Boolean.toString(b1);
		System.out.println("S3 = " + s3);

		// converts String array to List
		String[] sa = { "one", "two", "three", "four" };
		List<String> sList = Arrays.asList(sa); // make a List
		System.out.println("Size = " + sList.size());
		System.out.println("Index 2 = " + sList.get(2));
		
		//Get contents of List using Iterators
		Iterator<String> it = sList.iterator();
		System.out.println();
		while(it.hasNext()){
			String s4 = (String)it.next();
			System.out.println(s4);
		}

		String string1 = "Manish Keshav";
		char[] charArray = string1.toCharArray();
		System.out.println("charArray = " + Arrays.toString(charArray));

	}

}
