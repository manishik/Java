package com.learning.bigO;

import java.util.HashMap;
import java.util.Stack;

public class ConstantTimeExample {

    public static void main(String[] args) {
        // Example: HashMap Lookup
        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("France", "Paris");

        // Lookup operation in HashMap is O(1) on average
        String capital = capitalMap.get("India");
        System.out.println("Capital of India: " + capital);


        // Example: Stack Peek / Size
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);

        // O(1) operations
        System.out.println("Top element: " + stack.peek());
        System.out.println("Size of stack: " + stack.size());

    }
}

/*
    Why is this O(1)?
	•	HashMap uses a hash function to find the index where the value is stored.
	•	On average, accessing or inserting a value takes constant time (independent of the map size).
	•	Worst-case can degrade to O(n) if many collisions occur, but that’s rare with good hash functions.
 */