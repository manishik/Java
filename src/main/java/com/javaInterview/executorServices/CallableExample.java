package com.javaInterview.executorServices;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Submitting Callable Tasks with ExecutorService
//Unlike Runnable, Callable<T> returns a result and allows checked exceptions.

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 42; // Return value
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Task submitted, waiting for result...");
        Integer result = future.get(); // Blocking call
        System.out.println("Task result: " + result);

        executor.shutdown();
    }
}

// Key Features:
//	•	submit() returns a Future<T> that can retrieve the result.
//	•	get() blocks until the task completes.