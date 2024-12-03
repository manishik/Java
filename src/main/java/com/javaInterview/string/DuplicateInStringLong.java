package com.javaInterview.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInStringLong {

    public static void main(String[] args) {

        String string = "Checking this long string if there are any dups strings in this long string";

        String[] stringArray = string.split(" ");
        Map<String, Integer> aHashMap = new HashMap<String, Integer>();

        for (String str : stringArray) {
            if (aHashMap.containsKey(str)) {
                aHashMap.put(str, aHashMap.get(str) + 1);
            } else {
                /* If condition has to be checked above & if there are none matching string,
                just add 1 to Integer class else it will throw NullPointerException.
                For 1st iteration, it will always come to else part of this if condition */
                aHashMap.put(str, 1);
            }
        }
        System.out.println(aHashMap);
    }

}
