package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalFromChatGPT {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Hello, Java!");
        System.out.println(optional.get());

        // Important
        //Optional<String> optional1 = Optional.ofNullable(null); // Doesn't throw an error (NullPointerException)
        Optional<String> optional1 = Optional.ofNullable("Manish the Java King");
        System.out.println(optional1.isPresent()); // false
        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        } else {
            System.out.println("the Optional<String> is null");
        }

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent()); // false

        //Optional<String> optional2 = Optional.of(null); // throws NullPointerException
        Optional<String> optional2 = Optional.of("Java");
        if (optional2.isPresent()) {
            System.out.println(optional2.get()); // Prints: Java
        }

        Optional<String> optional3 = Optional.of("Java");
        optional3.ifPresent(value -> System.out.println("Value: " + value));

        String result = (String) Optional.ofNullable(null).orElse("Default Value");
        System.out.println(result); // Prints: Default Value

        String result1 = (String) Optional.ofNullable(null).orElseGet(() -> "Generated Default");
        System.out.println(result1); // Prints: Generated Default

        // Throws RuntimeException
        //String result3 = (String) Optional.ofNullable(null).orElseThrow(() -> new RuntimeException("Value is missing"));

        Optional<String> optionalHello = Optional.of("hello");
        Optional<String> upperCase = optionalHello.map(String::toUpperCase);
        System.out.println(upperCase.get()); // Prints: HELLO

        // flatMap() – Avoids Nested Optionals
        Optional<Optional<String>> nestedOptional = Optional.of(Optional.of("Java"));
        Optional<String> flattened = nestedOptional.flatMap(opt -> opt);
        System.out.println(flattened.get()); // Prints: Java

        Optional<String> optional4 = Optional.of("Nandini");
        optional4.filter(str -> str.startsWith("N")).ifPresent(System.out::println);

        // Optional with Streams
        List<String> words = Arrays.asList("Java", "Python", "Go", "Pun");
        Optional<String> found = words.stream().filter(word -> word.startsWith("M")).findFirst();
        System.out.println(found.orElse("Not Found")); // Prints: Python

        Optional<String> user = UserRepository.findUserById(1); // if any other id number, then doesn't print anything
        user.ifPresent(System.out::println); // Prints: Manish
    }

}

class UserRepository {
    static Optional<String> findUserById(int id) {
        if (id == 1) return Optional.of("Manish");
        return Optional.empty();
    }
}