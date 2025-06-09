package com.javaInterview.sort_search.comparator;

import java.util.Comparator;

public class AgeSort implements Comparator<Person> {

	public int compare(Person person, Person person2) {

		int age1 = person.getAge();
		int age2 = person2.getAge();

		return age1 - age2; // Ascending order
		//return age2 - age1; //Descending order

	}

}
