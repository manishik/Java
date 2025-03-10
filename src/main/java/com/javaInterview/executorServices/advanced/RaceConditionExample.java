package com.javaInterview.executorServices.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

// Synchronization in ExecutorService
// While ExecutorService helps manage concurrency, shared resources must be synchronized to prevent race conditions.
// Example of Race Condition

class Counter {
    private int count = 0;

    public void increment() {
        count++; // Not thread-safe
    }

    public int getCount() {
        return count;
    }
}

public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Counter counter = new Counter(); // Problem
        // AtomicCounter counter = new AtomicCounter(); // Solves the problem

        for (int i = 0; i < 1000; i++) {
            executor.execute(counter::increment);
        }

        executor.shutdown();
        Thread.sleep(2000); // Allow all tasks to finish

        System.out.println("Final Count: " + counter.getCount()); // Should be 1000 but isn't!
    }
}

// Problem:
//	•	Multiple threads modify count without synchronization, leading to incorrect results.

// Solution: Use synchronized or AtomicInteger

class AtomicCounter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // Thread-safe
    }

    public int getCount() {
        return count.get();
    }
}

// 	AtomicInteger ensures atomic (indivisible) operations without locking.