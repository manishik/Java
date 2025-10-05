package com.javaInterview.collections.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSetExample {

    public static void main(String[] args) {

        Set<String> mutableSet = new HashSet<>();
        mutableSet.add("Apple");
        mutableSet.add("Banana");

        Set<String> unmodifiableView = Collections.unmodifiableSet(mutableSet);
        System.out.println("Unmodifiable View: " + unmodifiableView);

        // Attempting to modify the unmodifiable view (will throw UnsupportedOperationException)
        try {
            unmodifiableView.add("Cherry");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable view: " + e.getMessage());
        }

        // Modifying the underlying mutable set affects the unmodifiable view
        mutableSet.add("Orange");
        System.out.println("Unmodifiable View after modifying underlying set: " + unmodifiableView);

        // Creating a truly immutable set (Java 9+)
        Set<String> immutableSet = Set.of("Red", "Green", "Blue");
        System.out.println("Immutable Set: " + immutableSet);

        // Attempting to modify the immutable set (will throw UnsupportedOperationException)
        try {
            immutableSet.remove("Red");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify (remove from) immutable set: " + e.getMessage());
        }

    }
}
