package com.learning.bigO;

import java.util.Map;
import java.util.TreeMap;

public class LogarithmicTimeExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        // Inserting entries — each insertion takes O(log n)
        studentMap.put(101, "Alice");
        studentMap.put(105, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(102, "David");

        // Lookup using key — O(log n)
        String student = studentMap.get(103);
        System.out.println("Student with ID 103: " + student);

        // Find next higher entry — O(log n)
        Map.Entry<Integer, String> nextStudent = studentMap.higherEntry(103);
        System.out.println("Next student after 103: " + nextStudent.getKey() + " - " + nextStudent.getValue());
    }
}

// Why is this O(log n)?
//	•	TreeMap maintains a balanced BST (Red-Black Tree).
//	•	Every insert, delete, or lookup reduces the search space in half at each level, leading to logarithmic performance.