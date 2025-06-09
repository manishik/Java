package com.javaInterview.sort_search.comparator;

import java.util.Comparator;

public class NameSort implements Comparator<Person> {

	public int compare(Person person, Person person2) {

		String personName1 = person.getName();
		String personName2 = person2.getName();

		// compare can internally use compareTo method
		// Ascending Order
		 return personName1.compareTo(personName2);

		// Descending Order
		//return personName2.compareTo(personName1);
	}

}
