package com.javaInterview.thread.executorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// A cached thread pool creates new threads as needed and reuses idle threads.
public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.execute(() -> {
                System.out.println("Task " + taskId + " is running in " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}

// Key points:
//	    No fixed limit on threads.
//	    Best for applications with short-lived tasks.