package com.java8;

import java.util.Optional;

public class Java8Optional {
    public static void main(String args[]) {
        Optional<String> gender = Optional.of("Male");
        String answer1 = "Manish Keshav";
        String answer2 = null;

        String fNameString = "Manish Keshav";
        String lNameString = null;
        Optional<String> fName = Optional.of(fNameString);

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        if (gender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

        if (Optional.of(fNameString).isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
    }


}
