package com.javaInterview.thread.executorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// A single-threaded executor runs tasks sequentially using a single thread.
public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.execute(() -> {
                System.out.println("Task " + taskId + " is running in " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}

// 	- Ensures that tasks execute in order.
//	- Suitable for tasks that must NOT run in parallel.