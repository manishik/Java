package com.javaInterview.collections.sets;

import java.util.*;

public class IterateSet {
	public static void main(String args[]) {
		String elements[] = { "Irish Setter", "Poodle", "English Setter",
				"Gordon Setter", "Pug" };
		Set set = new HashSet(Arrays.asList(elements));
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		Set hashSet = new HashSet<SomeClass>();

		SomeClass someClass1 = new SomeClass();
		someClass1.setSomeInt(1);
		someClass1.setSomeString("String");

		SomeClass someClass2 = new SomeClass();
		someClass2.setSomeInt(2);
		someClass2.setSomeString("String 2");

		SomeClass someClass3 = new SomeClass();
		someClass3.setSomeInt(1);
		someClass3.setSomeString("String");

		hashSet.add(someClass1);
		hashSet.add(someClass2);
		hashSet.add(someClass3);

		hashSet.add(someClass1);
		hashSet.add(someClass2);
		hashSet.add(someClass3);

		hashSet.add(someClass1);
		hashSet.add(someClass2);
		hashSet.add(someClass3);

		Iterator iter1 = hashSet.iterator();
		while (iter1.hasNext()) {
			//System.out.println((SomeClass)iter1.next());
			SomeClass someClass = (SomeClass)iter1.next();
			System.out.println(someClass.getSomeInt());
			System.out.println(someClass.getSomeString());
		}
	}
}


class SomeClass {
	private int someInt;
	private String someString;

	public int getSomeInt() {
		return someInt;
	}

	public void setSomeInt(int someInt) {
		this.someInt = someInt;
	}

	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		this.someString = someString;
	}

	@Override
	public String toString() {
		return "SomeClass{" +
				"someInt=" + someInt +
				", someString='" + someString + '\'' +
				'}';
	}
}