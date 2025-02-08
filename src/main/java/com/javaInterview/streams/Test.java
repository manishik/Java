package com.javaInterview.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Map<String, Integer> nameMap = new HashMap<>();
		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
		System.out.println("Value = " + value);

		Integer[] myNums = {1 , 2, 3};
		Stream<Integer> myStream = Arrays.stream(myNums);
		long numEle = myStream.filter((i) -> i>1).count();
		System.out.println(numEle);
	}

}
