package com.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEvenStream {

    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 1, 2, 4, 5, 5, 7, 45, 55, 55, 8, 9, 10, 10);
        Stream<Integer> integerFibStream = Stream.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946);
        Stream<Integer> integerFibStream1 = integerFibStream;

        System.out.println("Number List = " + numbersList);

        //System.out.println("Fib Stream = " + integerFibStream.collect(Collectors.toList()));
        //integerFibStream.forEach(System.out::println);

        List<Integer> evenNumberList = numbersList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        List<Integer> oddFibNumberList = integerFibStream.filter(i -> i % 2 != 0).collect(Collectors.toList());

        System.out.println("Even Number List = " + evenNumberList);
        Collections.reverse(evenNumberList);
        System.out.println("Even Number List Reversed = " + evenNumberList);
        System.out.println("Odd Fibonacci Number List = " + oddFibNumberList);
        //System.out.println("Even Number List = " + newNumberList.stream().sorted().collect(Collectors.toList()));
    }

}
