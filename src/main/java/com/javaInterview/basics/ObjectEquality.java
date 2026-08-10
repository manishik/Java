package com.javaInterview.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class ObjectEquality {

	public static void main(String[] args) {
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		Emp emp3 = emp2;
		Emp emp4 = new Emp();
		System.out.println("equals   " + emp1.equals(emp2));
		System.out.println("==       " + (emp1 == emp2));

		System.out.println("equals   " + emp2.equals(emp3));
		System.out.println("==       " + (emp2 == emp3));

		Emp emp5 = new Emp(2, "Nandini");
		Emp emp6 = new Emp(2, "Nandini");
		System.out.println("equals   " + emp5.equals(emp6));
		System.out.println("==       " + (emp5 == emp6));

		// emp1.method1(); emp2.method1(); emp3.method1(); emp4.method1();

		//Trying to add employee with same name in any collection 
		// Lists allow duplicate employees.
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(emp5);
		empList.add(emp6);
		System.out.println("ArrayList = " + empList);

		// The set contains one list object.
		Set<List<Emp>> hs = new HashSet<List<Emp>>();
		hs.add(empList);
		System.out.println("HashSet of List = " + hs);

		// HashSet uses equals() and hashCode(), so equal employees are removed.
		Set<Emp> hs1 = new HashSet<Emp>();
		hs1.add(emp5);
		hs1.add(emp6);
		System.out.println("HashSet  = "+hs1);

		// Equal keys replace the previous value.
		Map<Emp, String> hashMap = new HashMap<Emp, String>();
		hashMap.put(emp5, "N");
		hashMap.put(emp6, "N");
		System.out.println("HashMap = " + hashMap);

		// TreeMap uses compareTo() to sort keys and identify equal keys.
		Map<Emp, String> treeMap = new TreeMap<Emp, String>();
		treeMap.put(emp5, "N");
		treeMap.put(emp6, "N");
		System.out.println("TreeMap = " + treeMap);
	}
}

class Emp implements Comparable<Emp> {
	private int id;
	private String strName;
	public int age;

	Emp() {
		id = 1;
		strName = "Manish";
		age = 10;
	}

	Emp(int id, String strName) {
		this.id = id;
		this.strName = strName;
	}

	void method1() {
		System.out.println(id + " " + strName);
	}

	
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Emp)) {
			return false;
		}
		Emp employee = (Emp) object;
		return id == employee.id && Objects.equals(strName, employee.strName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, strName);
	}

	@Override
	public String toString() {
		return (id + " " + strName + " " + age);
	}

	@Override
	public int compareTo(Emp object) {
		int nameComparison = this.strName.compareTo(object.strName);
		if (nameComparison != 0) {
			return nameComparison;
		}
		return Integer.compare(this.id, object.id);
	}

}
