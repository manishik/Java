package com.java8.lambda;

interface Find {
    boolean findValue(int num);
}

public class LambdaTest {

    public static void main(String[] args) {

        Find even = (n) -> n % 2 == 0;
        Find positive = (n) -> n >= 0;

        boolean b1 = even.findValue(20);
        System.out.println("finding value 20 is even :  " + b1);

        boolean b2 = even.findValue(15);
        System.out.println("finding value 15 is even :  " + b2);

        System.out.println("10 is positive  :" + positive.findValue(10));
        System.out.println("-1 is positive :" + positive.findValue(-1));
    }

}