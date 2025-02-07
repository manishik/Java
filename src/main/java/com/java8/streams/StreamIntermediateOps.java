package com.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Intermediate Operations:

    1. filter(Predicate<T>):   Filters elements based on a condition

    2. map(Function<T, R>) :   Transforms elements

    3. sorted()            :   Sorts elements

    4. distinct()          :   Removes duplicates

    5. limit(n)            :   Limits the number of elements
 */
public class StreamIntermediateOps {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(1, 1, 92, -2, -2, 46, 5, 5, 0, 7, 4, 4, -44, 55, 55, 8, -5, -77, -9, 10, 10, 12, 12);
        System.out.println("Number List = " + numbersList);

        List<String> words = Arrays.asList("Apple", "banana", "cherry");


        // filter (Filters elements based on a CONDITION)

        List<Integer> evenNumberList = numbersList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Number List = " + evenNumberList);
        // Reversing the list
        Collections.reverse(evenNumberList);
        System.out.println("Even Number List Reversed = " + evenNumberList);


        /*---------------------------------------------------------------------------------------*/
        // map (Transforms elements in the stream)
        List<Integer> square = (List<Integer>) evenNumberList.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("Even Number List Squares = " + square);


        List<Integer> lengths = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Length of each word = " + lengths);


        List<Animal> animals = Arrays.asList(
                new Animal("Panda", 8),
                new Animal("Tiger", 15),
                new Animal("Elephant", 22)
        );
        List<String> animalNamesList = animals.stream().map(animal -> animal.name).collect(Collectors.toList());
        System.out.println("Names of Animals = " + animalNamesList);

        List<String> aniAge10more = animals.stream().filter(a -> a.age > 10).map(animal -> animal.name).collect(Collectors.toList());
        System.out.println("Names of Animals whose age is more than 10 = " + aniAge10more);

        List<String> greetings = words.stream().map(name -> "Hello, " + name + "!").collect(Collectors.toList());
        System.out.println("Greetings = " + greetings);


        List<char[]> charArrays = words.stream().map(String::toCharArray).collect(Collectors.toList());
        for (char[] arr : charArrays) {
            System.out.println(Arrays.toString(arr));
        }

        // Convert a List of Integers to Their String Representation
        List<String> stringNumbers = numbersList.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println("stringNumbers = " + stringNumbers); // Each number is converted into a string using String::valueOf.


        List<Character> firstChars = words.stream().map(word -> word.charAt(0)).collect(Collectors.toList());
        System.out.println("firstChars = " + firstChars);


        List<Integer> doubledNumbers = numbersList.parallelStream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("doubledNumbers = " + doubledNumbers);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "canish", "NANDI", "c4", "Aad4", "1Manish");
        List<String> list = myList.stream().filter(str -> str.startsWith("c")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("List = " + list);


        // filter & maps both used
        List<Integer> evenNumberSquareList = numbersList.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
        System.out.println("Even Number List Reversed & Squared = " + evenNumberSquareList);

        /*---------------------------------------------------------------------------------------*/
        // sorted (Sorts elements)
        System.out.println("Sorted Number List = " + numbersList.stream().sorted().collect(Collectors.toList()));
        System.out.println("Sorted Number List (Reversed) = " + numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        /*---------------------------------------------------------------------------------------*/
        // distinct (Removes duplicates)
        List<Integer> distinctEvenNumberList = numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Number List = " + distinctEvenNumberList);

        /*---------------------------------------------------------------------------------------*/
        // limit (Limits the number of elements)
        System.out.println("Limited Number List = " + numbersList.stream().limit(5).collect(Collectors.toList()));
        System.out.println("Limited Number List after sorting = " + numbersList.stream().sorted().limit(5).collect(Collectors.toList()));


        /*---------------------------------------------------------------------------------------*/
        // flatMap - convert the above 2 levels Stream into one Stream level or a 2d array into a 1d array.
        // Creating a list of prime numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
        // Creating a list of odd numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        // Creating a list of even numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        // Combining the above lists into a list of lists
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        // Printing the structure before flattening
        System.out.println("The Structure before flattening is : " + listOfListofInts);

        // Flattening the list of lists into a single list using flatMap
        List<Integer> listofInts = listOfListofInts.stream().flatMap(aList -> aList.stream()).collect(Collectors.toList());

        // Printing the structure after flattening
        System.out.println("The Structure after flattening is : " + listofInts);

        List<String> phrases = Arrays.asList("sporadic perjury", "confounded skimming", "incumbent jailer", "confounded jailer");
        System.out.println("Phrases = " + phrases.stream().flatMap(phrase -> Stream.of(phrase.split("\\s+")))
                .distinct().collect(Collectors.toList()));

        Stream<List<Integer>> integerListStream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
        Stream<Integer> integerStream = integerListStream.flatMap(Collection::stream);
        System.out.println("Integer Stream = " + integerStream.collect(Collectors.toList()));

    }

}

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}