package com.javaInterview.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringConversion {

    public static void main(String[] args) {
        String string = "100";

        System.out.println("String s1 = " + string);

        // parseShort converts String to short
        short s = Short.parseShort(string);
        System.out.println("String to short = " + s);

        // parseInt converts String to Integer
        int i = Integer.parseInt(string);
        System.out.println("String to int = " + i);

        // parseLong converts String to Long
        long l = Long.parseLong(string);
        System.out.println("String to long = " + l);

        // parseFloat converts String to Float
        float f = Float.parseFloat(string);
        System.out.println("String to float = " + f);

        // parseDouble converts String to Double
        double d = Double.parseDouble(string);
        System.out.println("String to double = " + d);

        // parseDouble converts String to Double
        double dd = Double.valueOf(string);
        System.out.println("dd = " + dd);

        int int1 = 200;
        System.out.println("int = " + int1);
        // toString converts int to String
        String string2 = Integer.toString(int1);
        System.out.println("int to String = " + string2);

        // toString converts boolean to String
        boolean b1 = true;
        System.out.println("boolean b1 = " + b1);
        String string3 = Boolean.toString(b1);
        System.out.println("boolean to String = " + string3);

        // converts String array to List
        String[] stringArray = {"one", "two", "three", "four"};
        List<String> listOfStrings = Arrays.asList(stringArray); // make a List
        System.out.println("List Of Strings Size = " + listOfStrings.size());
        System.out.println("2nd index in the List Of Strings = " + listOfStrings.get(2));

        //Get contents of List using Iterators
        Iterator<String> iterator = listOfStrings.iterator();
        System.out.println();
		System.out.println("Iterating the List Of Strings: ");
        while (iterator.hasNext()) {
            String string4 = (String) iterator.next();
            System.out.println(string4);
        }

        String string5 = "Manish Keshav";
        char[] charArray = string5.toCharArray();
        System.out.println("charArray = " + Arrays.toString(charArray));

    }

}
