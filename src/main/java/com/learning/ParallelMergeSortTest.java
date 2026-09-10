package com.learning;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelMergeSortTest {

    // Threshold determines when to stop splitting tasks and switch to sequential sort
    private static final int THRESHOLD = 1 << 16; // 65,536 elements

    public static void main(String[] args) {
        int size = 1_000_000_000; // 1 Billion integers

        System.out.println("⚙️ Initializing array with " + size + " random integers...");
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        // Use the common pool which automatically adapts to your M4 Max core count
        ForkJoinPool pool = ForkJoinPool.commonPool();
        System.out.println("🔥 Detected Parallelism Level (Active Cores): " + pool.getParallelism());
        System.out.println("⚡ Starting Parallel Merge Sort...");

        long startTime = System.currentTimeMillis();

        // Execute the parallel sort
        pool.invoke(new MergeSortTask(array, 0, size - 1));

        long endTime = System.currentTimeMillis();
        double durationSeconds = (endTime - startTime) / 1000.0;

        System.out.println("✅ Sorting completed successfully!");
        System.out.println("⏱️ Time taken: " + durationSeconds + " seconds");

        // Quick sanity check to ensure the array is actually sorted
        System.out.println("🔍 Verifying sort integrity...");
        if (isSorted(array)) {
            System.out.println("🎉 Success! The 1 billion integers are perfectly sorted.");
        } else {
            System.err.println("❌ Error: The array is not sorted correctly.");
        }
    }

    // ForkJoin Task for Parallel Merge Sort
    private static class MergeSortTask extends RecursiveAction {
        private final int[] array;
        private final int left;
        private final int right;

        public MergeSortTask(int[] array, int left, int right) {
            this.array = array;
            this.left = left;
            this.right = right;
        }

        @Override
        protected void compute() {
            // If the chunk size is small enough, sort sequentially to avoid thread overhead
            if (right - left < THRESHOLD) {
                sequentialMergeSort(array, left, right);
                return;
            }

            int mid = left + (right - left) / 2;

            // Divide the work into two sub-tasks
            MergeSortTask leftTask = new MergeSortTask(array, left, mid);
            MergeSortTask rightTask = new MergeSortTask(array, mid + 1, right);

            // Run tasks in parallel across the M4 Max cores
            invokeAll(leftTask, rightTask);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Standard Sequential Merge Sort for base cases
    private static void sequentialMergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sequentialMergeSort(array, left, mid);
            sequentialMergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    // Helper method to merge two sorted sub-arrays
    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        System.arraycopy(temp, 0, array, left, temp.length);
    }

    // Verification check
    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
