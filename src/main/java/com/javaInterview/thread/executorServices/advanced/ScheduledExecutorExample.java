package com.javaInterview.thread.executorServices.advanced;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Scheduling Tasks with ScheduledExecutorService
// Sometimes, we need to schedule tasks at a fixed rate or with delays.
// Creating a Scheduled Executor

public class ScheduledExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable runnableTask = () -> System.out.println("Task executed at " + System.currentTimeMillis());

        // Schedule a one-time task after 3 seconds
        scheduler.schedule(runnableTask, 3, TimeUnit.SECONDS);

        // Schedule a repeating task every 2 seconds, after an initial delay of 1 second
        scheduler.scheduleAtFixedRate(runnableTask, 1, 2, TimeUnit.SECONDS);

        // Stop after some time
        scheduler.schedule(() -> scheduler.shutdown(), 10, TimeUnit.SECONDS);
    }
}
