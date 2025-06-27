package com.javaInterview.collections.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(5);
		hashSet.add(new Integer(6));
		hashSet.add(new Integer(7));
		hashSet.add(new Integer(8));
		hashSet.add(new Integer(9));
		hashSet.add(new Integer(1));
		hashSet.add(new Integer(2));
		hashSet.add(new Integer(3));
		hashSet.add(new Integer(4));
		hashSet.add(new Integer(10));
		
		//Adding duplicates
		hashSet.add(new Integer(9));
		hashSet.add(new Integer(1));
		hashSet.add(new Integer(2));
		hashSet.add(new Integer(3));
		hashSet.add(new Integer(4));
		hashSet.add(new Integer(10));

		System.out.println("HashSet = "+hashSet); //A HashSet is an unsorted, unordered Set.
		
		// Use iterator to display the set
		System.out.println("HashSet : ");
		for (Iterator iterator = hashSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(" "+integer);
		}

		// Remove the integer 6
		System.out.println("\nRemove integer 6");
		hashSet.remove(6);

		System.out.println("\nHashSet After removing: ");
		for (Integer integer : hashSet) {
			System.out.print(" "+integer);
		}

		System.out.println();
		System.out.println("Iterating the same Set in a different way ");
		Iterator iter = hashSet.iterator();
		while (iter.hasNext()) {
			System.out.print(" "+iter.next());
		}

		System.out.println();
		System.out.println("Iterating the same Set using forEach ");
		hashSet.forEach(item -> System.out.print(item + " "));

		System.out.println();
		System.out.println("Iterating the same Set using streams ");
		hashSet.stream().forEach(System.out::print);

	}
}
