package com.java8;

import java.util.Optional;

public class Java8Optional1 {

    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Manish");
        opt.ifPresent(name -> System.out.println(name));

        String nullName = null;
        System.out.println(Optional.ofNullable(nullName).orElse("Manish Keshav"));
        System.out.println(Optional.ofNullable(nullName));

        /*if(Optional.ofNullable(nullName).isEmpty()){
            System.out.println("Null Value");
        }*/

    }

}
