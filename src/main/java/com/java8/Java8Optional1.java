package com.java8;

import java.util.Optional;

public class Java8Optional1 {

    public static void main(String[] args) {

        //Optional<String> optionalAString = "Manish"; //Syntax Error
        Optional<String> optionalString = Optional.of("Manish");

        if (optionalString.isPresent()) {
            System.out.println("Value present");
        } else {
            System.out.println("Empty");
        }
        optionalString.ifPresent(name -> System.out.println(name));

        Optional<String> optionalNullString = null;
        /*if(Optional.ofNullable(optionalNullString).isEmpty()){
            System.out.println("Null Value");
        }*/


        String strNull = null;
        /*if(Optional.ofNullable(strNull).isEmpty()){
            System.out.println("Null Value");
        }*/

        System.out.println(Optional.ofNullable(strNull).orElse("Manish Keshav"));
        System.out.println(Optional.ofNullable(strNull));

        if (Optional.ofNullable(strNull).isPresent()) {
            System.out.println("NOT NULL");
        } else {
            System.out.println("NULL");
        }
    }

}
