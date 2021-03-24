package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionBasic {
    public static void main(String[] args) {

        /*
            REMEMBER:
            parameter -> expression
            (parameter1, parameter2) -> expression
            (parameter1, parameter2) -> { code block }
            Lambda expressions are usually passed as parameters to a function
         */

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6);

        //1st Way
        System.out.println("1st Way");
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(" " + integer);
            }
        };
        numbers.forEach(consumer);
        System.out.println();
        System.out.println("----------------------------");

        //2nd Way
        System.out.println("2nd Way");
        Consumer<Integer> consumer1 = (Integer integer) -> {
            System.out.print(" " + integer);
        };
        numbers.forEach(consumer1);
        System.out.println();
        System.out.println("----------------------------");

        //3rd Way
        System.out.println("3rd Way");
        Consumer<Integer> consumer2 = (integer) -> System.out.print(" " + integer);
        numbers.forEach(consumer2);
        System.out.println();
        System.out.println("----------------------------");

        //4th Way
        System.out.println("4th Way");
        numbers.forEach(someVariable -> System.out.print(" " + someVariable));
        System.out.println();
        System.out.println("----------------------------");

        //5th Way
        System.out.println("5th Way");
        numbers.forEach(System.out::println);
    }
}
