package com.javaInterview.optionals;

import java.util.Optional;

public class Java8OptionalNullTest {
    public static void main(String[] args) {
        String incomingInputString = null;
        if(Optional.ofNullable(incomingInputString).isPresent()){
            System.out.println("String Value available");
        } else {
            System.out.println("String Value is null");
        }
    }
}
