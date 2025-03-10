package com.javaInterview.executorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Creating a Fixed Thread Pool
//  A fixed-size thread pool reuses a limited number of threads.

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); // 3 threads in pool

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executorService.execute(() -> {
                System.out.println("Task " + taskId + " is running in " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown(); // Shutdown the executorService gracefully
    }
}

// 	•	A fixed-size thread pool with 3 threads is created.
//	•	The executor reuses the 3 threads to execute 5 tasks.