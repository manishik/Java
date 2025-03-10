package com.javaInterview;

// 4th March 2025 with Fannie Mae through TechVentures

// Java implementation to divide N into
// maximum number of segments of length a, b and c

public class GFG {

    static int INT_MIN = -1000000000;

    // Function to find the maximum number of segments
    static int maximumSegments(int n, int a, int b, int c) {

        // Base case
        if (n == 0) {
            return 0;
        }

        int maxa = INT_MIN;
        // Conditions

        // Making one segment of length a
        if (n >= a) {
            maxa = Math.max(maxa, 1 + maximumSegments(n - a, a, b, c));
        }
        // Making one segment of length b
        if (n >= b) {
            maxa = Math.max(maxa, 1 + maximumSegments(n - b, a, b, c));
        }
        // Making one segment of length c
        if (n >= c) {
            maxa = Math.max(maxa, 1 + maximumSegments(n - c, a, b, c));
        }

        // Return maximum out of all possible segment
        return maxa;
    }

    // Driver code
    public static void main(String[] args) {
        //int n = 5, a = 5, b = 8, c = 15;
        //int n = 7, a = 5, b = 2, c = 5;
        //int n = 17, a = 2, b = 1, c = 3;
        int n = 5, a = 2, b = 3, c = 5;

        // Function call
        System.out.println(maximumSegments(n, a, b, c));
    }
}

// This code is contributed by ajaymakvana.

