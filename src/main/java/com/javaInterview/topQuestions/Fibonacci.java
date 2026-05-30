package com.javaInterview.topQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    static int i1 = 0, i2 = 1, i3 = 1;

    public static void main(String[] args) throws IOException {
        int number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number\n");
        number = Integer.parseInt(br.readLine());

        //fibonacci(number); // using iterative - WAY 1
        Fibonacci(i1, i2, number); // using iterative - WAY 2

		//Fibonacci(number); // using recursion - WAY 1
        //fibonacci(i1, i2, number); // using recursion - WAY 2
    }

    // using iterative - WAY 1
    static void fibonacci(int numberOfFibonacciElements) {
        System.out.println();
        System.out.print(i1 + "  " + i2 + "  ");
        for (int i = 2; i < numberOfFibonacciElements; i++) {
            int sum = i1 + i2;
            System.out.print(sum + "   ");
            i1 = i2;
            i2 = sum;
        }
    }

    // using iterative - WAY 2
    static void Fibonacci(int i1, int i2, int maxFibonacciNumber) {
        while (i1 <= maxFibonacciNumber) {
            System.out.print(i1 + "  ");
            int sum = i1 + i2;
            i1 = i2;
            i2 = sum;
        }
    }

    // using recursion - WAY 1
    static int Fibonacci(int maxFibonacciNumber) {
        if (maxFibonacciNumber >= i3) {
            System.out.print(i3 + "   ");
            i3 = i1 + i2;
            i1 = i2;
            i2 = i3;
            return (Fibonacci(maxFibonacciNumber));
        } else {
            return (1);
        }
    }

    // using recursion - WAY 2
    static void fibonacci(int i1, int i2, int maxFibonacciNumber) {
        if (i1 > maxFibonacciNumber) return;
        System.out.print(i1 + "  ");
        int sum = i1 + i2;
        fibonacci(i2, sum, maxFibonacciNumber);
    }

}
