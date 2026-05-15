package com.javaInterview.streams;

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

        List<String> wordsList = Arrays.asList("Apple", "banana", "cherry", "Apple");


        // filter (Filters elements based on a CONDITION)

        List<Integer> evenNumberList = numbersList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Number List = " + evenNumberList);
        // Even Number List = [92, -2, -2, 46, 0, 4, 4, -44, 8, 10, 10, 12, 12]

        // Reversing the list
        Collections.reverse(evenNumberList);
        System.out.println("Even Number List Reversed = " + evenNumberList);
        // Even Number List Reversed = [12, 12, 10, 10, 8, -44, 4, 4, 0, 46, -2, -2, 92]


        /*---------------------------------------------------------------------------------------*/
        // map (Transforms elements in the stream)
        List<Integer> square = (List<Integer>) evenNumberList.stream().map(x -> x * x).toList(); //.toList() method Java 17 onwards
        System.out.println("Even Number List Squares = " + square);
        // Even Number List Squares = [144, 144, 100, 100, 64, 1936, 16, 16, 0, 2116, 4, 4, 8464]

        List<Integer> lengths = wordsList.stream().map(String::length).toList();
        System.out.println("Length of each word = " + lengths);
        // Length of each word = [5, 6, 6, 5]

        List<Animal> animals = Arrays.asList(
                new Animal("Panda", 15),
                new Animal("Tiger", 10),
                new Animal("Elephant", 60),
                new Animal("Dog", 10),
                new Animal("Cat", 5),
                new Animal("Horse", 25)
        );
        List<String> animalNamesList = animals.stream().map(animal -> animal.name).collect(Collectors.toList());
        System.out.println("Names of Animals = " + animalNamesList);
        // Names of Animals = [Panda, Tiger, Elephant, Dog, Cat, Horse]

        List<String> aniAge10more = animals.stream().filter(a -> a.age > 10).map(animal -> animal.name).collect(Collectors.toList());
        System.out.println("Names of Animals whose age is more than 10 = " + aniAge10more);
        // Names of Animals whose age is more than 10 = [Panda, Elephant, Horse]

        List<String> greetings = wordsList.stream().map(name -> "Hello, " + name + "!").collect(Collectors.toList());
        System.out.println("Greetings = " + greetings);
        // Greetings = [Hello, Apple!, Hello, banana!, Hello, cherry!, Hello, Apple!]

        System.out.println("Counting the number of occurances: ");
        wordsList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));
        /*banana: 1
        cherry: 1
        Apple: 2*/

        List<char[]> charArrays = wordsList.stream().map(String::toCharArray).collect(Collectors.toList());
        for (char[] arr : charArrays) {
            System.out.println(Arrays.toString(arr));
        }

        // Convert a List of Integers to Their String Representation
        List<String> stringNumbers = numbersList.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println("stringNumbers = " + stringNumbers); // Each number is converted into a string using String::valueOf.
        // stringNumbers = [1, 1, 92, -2, -2, 46, 5, 5, 0, 7, 4, 4, -44, 55, 55, 8, -5, -77, -9, 10, 10, 12, 12]

        List<Character> firstCharsInWordsList = wordsList.stream().map(word -> word.charAt(0)).collect(Collectors.toList());
        System.out.println("firstCharsInWordsList = " + firstCharsInWordsList);
        // firstCharsInWordsList = [A, b, c, A]

        List<Integer> doubledNumbers = numbersList.parallelStream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("doubledNumbers = " + doubledNumbers);
        // doubledNumbers = [2, 2, 184, -4, -4, 92, 10, 10, 0, 14, 8, 8, -88, 110, 110, 16, -10, -154, -18, 20, 20, 24, 24]

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "canish", "NANDI", "c4", "Aad4", "1Manish");
        List<String> list = myList.stream().filter(str -> str.startsWith("c")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("List = " + list);
        // List = [C2, CANISH, C4]

        // filter & maps both used
        List<Integer> evenNumberSquareList = numbersList.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
        System.out.println("Even Number List Reversed & Squared = " + evenNumberSquareList);
        // Even Number List Reversed & Squared = [8464, 4, 4, 2116, 0, 16, 16, 1936, 64, 100, 100, 144, 144]

        /*---------------------------------------------------------------------------------------*/
        // sorted (Sorts elements)
        System.out.println("Sorted Number List = " + numbersList.stream().sorted().collect(Collectors.toList()));
        // Sorted Number List = [-77, -44, -9, -5, -2, -2, 0, 1, 1, 4, 4, 5, 5, 7, 8, 10, 10, 12, 12, 46, 55, 55, 92]
        System.out.println("Sorted Number List (Reversed) = " + numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        // Sorted Number List (Reversed) = [92, 55, 55, 46, 12, 12, 10, 10, 8, 7, 5, 5, 4, 4, 1, 1, 0, -2, -2, -5, -9, -44, -77]

        /*---------------------------------------------------------------------------------------*/
        // distinct (Removes duplicates)
        List<Integer> distinctEvenNumberList = numbersList.stream().distinct().toList();
        System.out.println("Distinct Number List = " + distinctEvenNumberList);

        /*---------------------------------------------------------------------------------------*/
        // limit (Limits the number of elements)
        System.out.println("Limited Number List = " + numbersList.stream().limit(5).collect(Collectors.toList()));
        // Limited Number List = [1, 1, 92, -2, -2]
        System.out.println("Limited Number List after sorting = " + numbersList.stream().sorted().limit(5).collect(Collectors.toList()));
        // Limited Number List after sorting = [-77, -44, -9, -5, -2]

        /*---------------------------------------------------------------------------------------*/
        // flatMap - convert the above 2 levels Stream into one Stream level or a 2d array into a 1d array.
        // Creating a list of prime numbers
        List<Integer> PrimeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        // Creating a list of odd numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        // Creating a list of even numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        // Combining the above lists into a list of lists
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        // Printing the structure before flattening
        System.out.println("The Structure before flattening is : " + listOfListofInts);
        // The Structure before flattening is : [[2, 3, 5, 7, 11, 13, 17, 19], [1, 3, 5], [2, 4, 6, 8]]

        // Flattening the list of lists into a single list using flatMap
        List<Integer> listofInts = listOfListofInts.stream().flatMap(aList -> aList.stream()).toList();

        // Printing the structure after flattening
        System.out.println("The Structure after flattening is : " + listofInts);
        // The Structure after flattening is : [2, 3, 5, 7, 11, 13, 17, 19, 1, 3, 5, 2, 4, 6, 8]

        List<String> phrases = Arrays.asList("sporadic perjury", "confounded skimming", "incumbent jailer", "confounded jailer");
        System.out.println("Phrases = " + phrases.stream().flatMap(phrase -> Stream.of(phrase.split("\\s+")))
                .distinct().toList());

        Stream<List<Integer>> integerListStream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
        Stream<Integer> integerStream = integerListStream.flatMap(Collection::stream);
        System.out.println("Integer Stream = " + integerStream.toList());

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