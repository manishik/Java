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

		// declare the predicate type as string and use
		// lambda expression to create object
		Predicate<String> strWhichStartsWithGe = (string) -> string.startsWith("Ge");

		// Iterate through the list
		System.out.println("List of items matching Predicate : ");
		for (String string : listOfString) {
			// call the test method
			if (strWhichStartsWithGe.test(string))
				System.out.println(string);
		}
		
		System.out.println();
		
		// Creating predicate 
        Predicate<Integer> lesserthan = i -> (i < 18);  
  
        // Calling Predicate method 
        System.out.println("lesserthan = " + lesserthan.test(10));  
        System.out.println("lesserthan = " + lesserthan.test(18));  
        
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
            System.out.println("Number >7 is  " + inputNumber); 
        } else {
        	 System.out.println("Number <7 is " + inputNumber); 
        }
    } 
	
}
