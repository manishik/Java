package com.learning.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

class UtilDemo3 {
	public static void main(String[] args) {
		String[] coins = { "A", "B", "C", "D", "E", "F", "G", "H" , "E", "A", "B"};

		//Converting Array to List
		List list = new ArrayList();
		for (int i = 0; i < coins.length; i++)
			list.add(coins[i]);
		
		/*List list1 = Arrays.asList(coins);
		System.out.println(list1);*/

		ListIterator liter = list.listIterator();

		System.out.println("ArrayList");
		while (liter.hasNext())
			System.out.print(" "+liter.next());

        System.out.println();

        List<String> strList = Arrays.asList(coins);
        Set<String> strSet = new TreeSet<>(strList);
        System.out.println("Sorted Set = "+strSet);

        Collections.sort(strList);

        System.out.println("sorted : " + strList);

		System.out.println();
		System.out.println("ArrayList after Reversing");
		Collections.reverse(list);

		liter = list.listIterator();

		while (liter.hasNext())
			System.out.print(" "+liter.next());
	}
}
