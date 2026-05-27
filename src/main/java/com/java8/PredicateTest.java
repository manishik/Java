package com.java8;

//A simple program to demonstrate the use 
// of predicate interface 

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String args[]) {

		// create a list of strings
		List<String> listOfString = Arrays.asList("Keshav", "Geek", "GEico", "g1", "GeeksQuiz", "QA", "Manish");
        System.out.println("List of String = " + listOfString);

		// declare the predicate type as string and use
		// lambda expression to create object
		Predicate<String> strWhichStartsWithGe = (string) -> string.startsWith("Ge");

		// Iterate through the list
		System.out.println("List of strings which starts with 'Ge' (matching Predicate) : ");
		for (String string : listOfString) {
			// call the test method
			if (strWhichStartsWithGe.test(string))
				System.out.println(string);
		}
		
		System.out.println();
		
		// Creating predicate 
        Predicate<Integer> lesserthan18 = i -> (i < 18);
  
        // Calling Predicate method 
        System.out.println("Is 10 lesserthan18 = " + lesserthan18.test(10));
        System.out.println("Is 18 lesserthan18 = " + lesserthan18.test(18));
        
        System.out.println();
        
        Predicate<Integer> greaterThanTen = (i) -> i > 10; 
        
        // Creating predicate 
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
        System.out.println(result); 
  
        // Calling Predicate method 
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
        System.out.println(result2); 
        
        pred(5, (i) -> i > 7); 
		
	}
	
	static void pred(int inputNumber, Predicate<Integer> predicate) 
    { 
        if (predicate.test(inputNumber)) { 
            System.out.println(inputNumber +" is > 7");
        } else {
        	 System.out.println(inputNumber +" is < 7");
        }
    } 
	
}
