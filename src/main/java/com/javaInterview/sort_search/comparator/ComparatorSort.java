package com.javaInterview.sort_search.comparator;

import java.util.*;

public class ComparatorSort {

	// using List
	List personArrayList = new ArrayList<Person>();

	// using Arrays
	Person[] person = new Person[3];

	public static void main(String[] args) {
		new ComparatorSort().go();
	}

	public void go() {

		/*
		 * personArrayList.add(new Person("Nandini", 26)); personArrayList.add(new
		 * Person("Samarth", 1)); personArrayList.add(new Person("Manish", 32));
		 */

		// Date modified 28th March 2016
		// sorting person but person need not implement Comparator
		personArrayList.add(new Person("Nandini", 29));
		personArrayList.add(new Person("Samarth", 3));
		personArrayList.add(new Person("Manish", 35));

		person[0] = new Person("Nandini", 29);
		person[1] = new Person("Samarth", 3);
		person[2] = new Person("Manish", 35);

		System.out.println("Person Name List = " + personArrayList);
		// Collections sorting
		// Using a different classes
		 Collections.sort(personArrayList, new NameSort());
		// Collections.sort(personArrayList, new AgeSort());

		//Collections.sort(personArrayList);

		// Sort by PersonName directly
		/*Collections.sort(personArrayList, new Comparator<Person>() {
			public int compare(Person person, Person person2) {
				return person.getName().compareTo(person2.getName());
			}
		});*/

		System.out.println("Sorted Person's List by Name = " + personArrayList);

		// Display array 
		System.out.println("Person Names = ");
		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].getName() + " " + person[i].getAge());
		}

		// Arrays sorting
		// Arrays.sort(person, new NameSort());
		Arrays.sort(person, new AgeSort());

		System.out.println("Person after sorting by Age = ");
		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].getName() + " " + person[i].getAge());
		}

	}

}
