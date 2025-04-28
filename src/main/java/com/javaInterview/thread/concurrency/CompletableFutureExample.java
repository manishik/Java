package com.javaInterview.thread.concurrency;

import java.util.concurrent.CompletableFuture;

/*
Explanation:
        1.	CompletableFuture.runAsync() runs a task asynchronously.
        2.	The main thread continues executing without waiting for the task.
        3.	Thread.sleep(2000) simulates a delay in the asynchronous task.
        4.	future.join() waits for the task to complete before ending the program.
 */

public class CompletableFutureExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts...");

        // Run an asynchronous task
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a long-running task
                System.out.println("Task executed asynchronously");
                //throw new Exception("Manish, there is an exception executing task in CompletableFuture");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace(); // Handles the exception
                //throw new RuntimeException(e);
            }
        });

        // Non-blocking: The main thread can continue executing
        System.out.println("Main thread continues...");

        // Block and wait for the future to complete (optional)
        completableFuture.join();

        System.out.println("Back continuing the execution of main thread...");
        System.out.println("Main thread ends...");

        // thenApply() is used to process and transform the result synchronously.
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> "Hello").thenApply(result -> result + " Manish!")
                        .thenApply(String::toUpperCase);
        System.out.println(future.join());

        // thenCompose() is used for dependent asynchronous calls, flattening nested CompletableFuture objects.
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result + " Manish World!"));

        System.out.println(future1.join());

    }
}

