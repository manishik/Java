package com.javaInterview;

public class InsertNumber {

    public static void main(String[] args) {
        InsertNumber test = new InsertNumber();
        int result = test.Solution(6748954);
        System.out.println("Reverse  = " + result);
    }

    public int Solution(int N){
        int num = 5, rev = 0;
        System.out.println("Original: " + N);
        while(N != 0) {
            rev = rev * 10 + (N % 10);
            N = N/10;
        }
        return rev;
    }


}
