package com.javaInterview.thread.executorServices.advanced;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

// ForkJoinPool (Parallel Processing)

// When dealing with CPU-intensive tasks, ForkJoinPool is better than ExecutorService.
// It uses work-stealing, where idle threads take work from busy threads.

class SumTask extends RecursiveTask<Integer> {
    private final int[] arr;
    private final int start, end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 5) { // Base case: Compute directly
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        }

        // Split into two subtasks
        int mid = (start + end) / 2;
        SumTask leftTask = new SumTask(arr, start, mid);
        SumTask rightTask = new SumTask(arr, mid, end);

        leftTask.fork(); // Run asynchronously
        int rightResult = rightTask.compute();
        int leftResult = leftTask.join();

        return leftResult + rightResult;
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        SumTask task = new SumTask(numbers, 0, numbers.length);
        int sum = forkJoinPool.invoke(task);

        System.out.println("Total Sum: " + sum);
    }
}

// Key Features:
//	•	Recursively splits the task into smaller chunks.
//	•	fork() runs the task asynchronously.
//	•	join() waits for the result.
//	•	Efficient for large recursive tasks, such as sorting and graph traversal.