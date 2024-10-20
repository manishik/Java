package com.java8;

import java.util.Optional;

public class Java8Optional {
    public static void main(String args[]) {

        Optional<String> optionalStrGender = Optional.of("Male");

        String strFName = "Manish Keshav";
        String strLNameNull = null;
        Optional<String> OptionaStrFName = Optional.of(strFName);

        System.out.println("Non-Empty Optional =  " + optionalStrGender);
        System.out.println("Non-Empty Optional: Gender value =  " + optionalStrGender.get());
        System.out.println("Empty Optional =  " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional =  " + Optional.ofNullable(strFName));
        System.out.println("ofNullable on Empty Optional =  " + Optional.ofNullable(strLNameNull));

        if (optionalStrGender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        optionalStrGender.ifPresent(g -> System.out.println("In gender Option, value available."));

        if (Optional.of(strFName).isPresent()) {
            System.out.println("Value available.");

        } else {
            System.out.println("Value not available.");
        }

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional =  " + Optional.of(strLNameNull));
    }


}
