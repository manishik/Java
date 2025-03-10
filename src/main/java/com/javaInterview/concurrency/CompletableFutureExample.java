package com.javaInterview.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts...");

        // Run an asynchronous task
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a long-running task
                System.out.println("Task executed asynchronously");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Non-blocking: The main thread can continue executing
        System.out.println("Main thread continues...");

        // Block and wait for the future to complete (optional)
        future.join();

        System.out.println("Main thread ends...");
    }
}

/*
Explanation:
        1.	CompletableFuture.runAsync() runs a task asynchronously.
        2.	The main thread continues executing without waiting for the task.
        3.	Thread.sleep(2000) simulates a delay in the asynchronous task.
        4.	future.join() waits for the task to complete before ending the program.*/
