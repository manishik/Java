package com.learning.bigO;

import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

public class LinearTimeExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", "HR"),
                new Employee(102, "Bob", "Engineering"),
                new Employee(103, "Charlie", "Finance"),
                new Employee(104, "David", "Engineering")
        );

        // Find and print all employees in Engineering
        // This is a linear scan – O(n)
        for (Employee emp : employees) {
            if ("Engineering".equals(emp.department)) {
                System.out.println(emp.name + " works in Engineering.");
            }
        }
    }
}

// Why is this O(n)?
//	•	We are scanning each element once, checking a condition, and acting on it.
//	•	Time grows linearly with the number of employees in the list.

/*
    Other Real-World O(n) Examples in Java:
	•	ArrayList.contains(value)
	•	Collections.max(list) or min(list)
	•	Iterating over a LinkedList (no index access)
	•	Reading a file line-by-line with BufferedReader
 */