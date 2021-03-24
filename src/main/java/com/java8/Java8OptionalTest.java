package com.java8;

import java.util.Optional;

public class Java8OptionalTest {

    public static void main(String args[]) {
        Java8OptionalTest java8Tester = new Java8OptionalTest();
        Integer integer1 = null;
        Integer integer2 = new Integer(10);

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> optionalInteger1 = Optional.ofNullable(integer1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> optionalInteger2 = Optional.of(integer2);
        System.out.println(java8Tester.sum(optionalInteger1, optionalInteger2));
    }

    public Integer sum(Optional<Integer> optionalInteger1, Optional<Integer> optionalInteger2) {
        //Optional.isPresent - checks the value is present or not

        System.out.println("First parameter is present: " + optionalInteger1.isPresent());
        System.out.println("Second parameter is present: " + optionalInteger2.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer integer1 = optionalInteger1.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer integer2 = optionalInteger2.get();
        return integer1 + integer2;
    }
}
