package com.javaInterview.optionals;

import java.util.Optional;

public class Java8Optional1 {

    public static void main(String[] args) {

        String string = "Manish";
        //Optional<String> optionalAString = "Manish"; //Syntax Error
        Optional<String> optionalString = Optional.of(string);
        //Optional<String> optionalString = Optional.of("Manish");

        if (optionalString.isPresent()) {
            System.out.println("Value present");
        } else {
            System.out.println("Empty");
        }
        optionalString.ifPresent(name -> System.out.println("Name = " + name));

        Optional<String> optionalNullString = null;
        if(!optionalNullString.isPresent()){
            System.out.println("Null Value");
        }


        String nullString = null;
        /*if(Optional.ofNullable(nullString).isEmpty()){
            System.out.println("Null Value");
        }*/

        System.out.println(Optional.ofNullable(nullString).orElse("Manish Keshav"));
        System.out.println(Optional.ofNullable(nullString));

        if (Optional.ofNullable(nullString).isPresent()) {
            System.out.println("NOT NULL");
        } else {
            System.out.println("NULL");
        }
    }

}
