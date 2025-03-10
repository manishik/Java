package com.javaInterview.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledFutureExample {
    public static void main(String[] args) {
        // Create a scheduled executor service with a single thread
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule a task to run after 3 seconds
        ScheduledFuture<?> scheduledFuture = scheduler.schedule(() -> {
            System.out.println("Task executed after 5 seconds");
        }, 5, TimeUnit.SECONDS);

        try {
            // Wait until the scheduled task completes
            scheduledFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the scheduler
        scheduler.shutdown();
    }
}

/*
Explanation:
	1.	A ScheduledExecutorService is created with a thread pool of size 1.
	2.	A task (Runnable) is scheduled to run after a delay of 3 seconds.
	3.	scheduledFuture.get() blocks until the scheduled task completes.
	4.	The scheduler is shut down after execution.*/
