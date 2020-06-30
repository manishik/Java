package com.java8.streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrg1 {

    public static void main(String[] args) {
        List<Integer> listOfInts = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        System.out.println("List of Number = " + listOfInts);
        List<Integer> square = (List<Integer>) listOfInts.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("List of Squares = " + square);

        List<String> stringList = new LinkedList<String>();
        stringList.add("Manish");
        stringList.add("Keshav");

        Stream<String> stream = stringList.stream();
        System.out.println("Stream = " + stream.count());

    }

}
