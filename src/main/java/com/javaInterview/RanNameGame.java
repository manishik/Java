package com.javaInterview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RanNameGame {

    public static void main(String[] args) throws IOException {
        List<Person> people = generateRandomName();
        people.stream().forEach(person -> System.out.println(person.firstName + "  " + person.lastName));
        for (Person person : people) {
            System.out.println(person.firstName + "  " + person.lastName);
        }
    }

    static void startGame() {

    }


    static List<Person> generateRandomName() {
        Path path = Path.of("/Users/manishkeshav/_Work2025/Java/names.csv");
        try (Stream<String> lines = Files.lines(path)) {
            List<Person> people = lines
                    .skip(1) // Uncomment if there’s a header
                    .map(line -> line.split(",", 2))
                    .filter(columns -> columns.length == 2)
                    .map(columns -> new Person(columns[0].trim(), columns[1].trim()))
                    .collect(Collectors.toList());
            return people;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

// Custom class to hold two columns
class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
