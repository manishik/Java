package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class StreamPrg2 {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1", "c3", "c4", "c5", "c8");
		myList.stream().forEach(System.out::print);
		System.out.println();
		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted(Comparator.reverseOrder()).forEach(System.out::println);

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Manish");
		hashSet.add("Manish");
		hashSet.add("Manish");

		System.out.println("hashSet = " + hashSet);
		hashSet.stream().forEach(System.out::println);
		hashSet.stream().map(String::toUpperCase).forEach(System.out::println);

		String s1 = "C123";
		System.out.println("Matches = " + s1.matches("C123"));

	}

}
