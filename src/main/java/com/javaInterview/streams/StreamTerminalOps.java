package com.javaInterview.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Terminal Operations (Consumes a Stream)
    forEach()                       :   Iterates over elements
    collect(Collectors.toList())    :   Collects elements into a list
    count()                         :   Returns the number of elements
    reduce(BinaryOperator<T>)       :   Performs aggregation of stream elements (sum, product, etc.)
    anyMatch(Predicate<T>)          :   Checks if any element matches the condition
 */
public class StreamTerminalOps {

    public static void main(String[] args) {

        /*---------------------------------------------------------------------------------------*/
        // forEach
        HashSet<String> hashSetString = new HashSet<String>();
        hashSetString.add("Manish");
        hashSetString.add("Manish");
        hashSetString.add("Nandini");
        hashSetString.add("Sam");
        hashSetString.add("Manish");
        hashSetString.add("Aadhya");
        System.out.println("HashSet Strings = " + hashSetString);
        // Output: HashSet Strings = [Nandini, Manish, Aadhya, Sam]
        System.out.println("HashSet Strings = ");
        // Output: HashSet Strings =
        hashSetString.stream().forEach(System.out::println);
        // Output: Nandini
        // Manish
        // Aadhya
        // Sam
        hashSetString.stream().forEach(i -> System.out.print(i + " "));
        // Output: "Nandini Manish Aadhya Sam " (with a trailing space)
        System.out.println();
        // Output: (moves to the next line after "Nandini Manish Aadhya Sam ")

        /*---------------------------------------------------------------------------------------*/
        // collect(Collectors.toList())
        List<Integer> numbersList = Arrays.asList(1, 1, 92, -2, 77, -9, 10, 10, 12, 12);
        System.out.println("Number List = " + numbersList.stream().collect(Collectors.toList()));
        // Output: Number List = [1, 1, 92, -2, 77, -9, 10, 10, 12, 12]

        List<String> strList = Arrays.asList("a", "1", "Manish", "0", "Nandini", "Sam", "Manish", "-10");
        System.out.println("String List = " + strList.stream().collect(Collectors.toList()));
        // Output: String List = [a, 1, Manish, 0, Nandini, Sam, Manish, -10]

        /*---------------------------------------------------------------------------------------*/
        // count
        List<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("Manish");
        stringLinkedList.add("Nandini");
        stringLinkedList.add("Keshav");
        stringLinkedList.add("B");
        Stream<String> stream = stringLinkedList.stream();
        System.out.println("Stream count = " + stream.count());
        // Output: Stream count = 4

        //---------------------------------------------------------------------------------------
        // reduce
        /*
        The reduce() method in Java Streams is used to perform aggregation operations such as summing, multiplying,
        finding the maximum or minimum, concatenation, and more.
        It takes a BinaryOperator function and reduces the elements to a single result.
         */
        List<Product> products = new ArrayList<Product>(); // Product class is in another class
        products.add(new Product("P1", 286));
        products.add(new Product("P2", 512));
        products.add(new Product("P3", 268));
        products.add(new Product("P4", 258));
        products.add(new Product("P5", 431));
        products.add(new Product("P6", 289));

        // lowest product price
        Product product = products.stream().reduce(products.get(0), (p1, p2) -> p1.getProductPrice() < p2.getProductPrice() ? p1 : p2);
        System.out.println("Product = " + product);
        // Output: Product = Product{productName='P4', productPrice=258}

        List<Integer> numbers = Arrays.asList(10, 25, 13, 7, 30, 1, -3);
        System.out.println("Number List = " + numbers.stream().collect(Collectors.toList()));
        // Output: Number List = [10, 25, 13, 7, 30, 1, -3]
        //min
        Optional<Integer> min = numbers.stream().reduce(Integer::min); // Using method reference
        min.ifPresent(value -> System.out.println("Min: " + value));
        // Output: Min: -3
        //max
        Optional<Integer> max = numbers.stream().reduce((a, b) -> a > b ? a : b); // Find max
        //Optional<Integer> max = numbers.stream().reduce(Integer::max); // Using method reference
        max.ifPresent(value -> System.out.println("Max: " + value));
        // Output: Max: 30
        //sum - can use any 3 ways below
        //int sum = numbers.stream().reduce(0, (a, b) -> a + b); // Lambda: sum two numbers
        int sum = numbers.stream().reduce(0, Integer::sum); // Using method reference
        System.out.println("Sum: " + sum);
        // Output: Sum: 83

        int multiply = numbers.stream().reduce(1, (a, b) -> a * b); // Multiply elements
        System.out.println("Multiply = : " + multiply);
        // Output: Multiply = : -2047500

        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams", "Manish");
        String result = words.stream().reduce("Wow", (a, b) -> a + " " + b).trim(); //Wow can be empty
        System.out.println("Concatenated String: " + result);
        // Output: Concatenated String: Wow Hello World Java Streams Manish

        //---------------------------------------------------------------------------------------
        // anyMatch()
        /*
            The anyMatch(Predicate<T>) method in Java Streams is used to check if at least one element in the stream satisfies a given condition.
            It returns a boolean (true or false) and short-circuits (stops processing further if a match is found).

            - Returns true if at least one element satisfies the condition.
            - Short-circuits – Stops processing as soon as a match is found.
            - Works with primitive and object streams.
            - Parallel stream improves performance for large datasets.
            - Safe for empty collections – Returns false if no elements match.

         */
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Contains even number: " + hasEven);
        // Output: Contains even number: true

        // For large datasets, parallelStream() improves performance by processing elements concurrently.
        boolean hasEvenParallelStream = numbers.parallelStream().anyMatch(n -> n % 2 == 0);
        System.out.println("Contains even number (parallelStream): " + hasEvenParallelStream);
        // Output: Contains even number (parallelStream): true

        boolean containsLetterC = words.stream().anyMatch(word -> word.contains("j"));
        boolean containsLetterS = words.stream().anyMatch(word -> word.contains("S"));
        System.out.println("Any word contains 'j': " + containsLetterC);
        // Output: Any word contains 'j': false
        System.out.println("Any word contains 'S': " + containsLetterS);
        // Output: Any word contains 'S': true

        boolean startsWithM = words.stream().anyMatch(word -> word.startsWith("M"));
        System.out.println("Any word starts with 'M': " + startsWithM);
        // Output: Any word starts with 'M': true

        boolean containsJava = words.stream().anyMatch(name -> name.equals("Java"));
        System.out.println("Contains Java: " + containsJava);
        // Output: Contains Java: true

        int[] intNumbers = {10, -5, 3, 8, 15};
        boolean hasNegative = Arrays.stream(intNumbers).anyMatch(n -> n < 0);
        System.out.println("Contains negative number: " + hasNegative);
        // Output: Contains negative number: true

        List<Employee> employees = Arrays.asList(
                new Employee("John", 28),
                new Employee("Manish", 43),
                new Employee("Bob", 22)
        );
        boolean hasSenior = employees.stream().anyMatch(emp -> emp.age > 30);
        System.out.println("Has employees older than 30: " + hasSenior);
        // Output: Has employees older than 30: true

        boolean isManish = employees.stream().anyMatch(emp -> emp.name.startsWith("Man"));
        System.out.println("Is Manish there?  = " + isManish);
        // Output: Is Manish there?  = true

        // To avoid issues when using anyMatch() on an empty list, check if it’s empty first.
        List<Integer> emptyList = new ArrayList<>(); // Empty list
        boolean hasPositive = emptyList.stream().anyMatch(n -> n > 0); // Works fine even if the list is empty.
        System.out.println("Contains positive number: " + hasPositive);
        // Output: Contains positive number: false
    }

}

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
