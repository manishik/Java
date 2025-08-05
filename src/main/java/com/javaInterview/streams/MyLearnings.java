package com.javaInterview.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyLearnings {

    public static void main(String[] args) {

        String str = "Manishhh";
        Stream<String> streamStr = Stream.of(str);
        List<String> aList = streamStr.map(String::toUpperCase).collect(Collectors.toList());
        String strArray[] = aList.toArray(new String[0]);
        System.out.println("aList = " + aList);
        System.out.println("strArray = " + Arrays.toString(strArray));

        String string = "SomeeeStringg";
        char[] charArray = string.toCharArray();
        System.out.println("charArray = " + Arrays.toString(charArray));

        Set<Character> aSet = new HashSet<>();
        for (char c : charArray) {
            aSet.add(c);
        }
        System.out.println("aSet = " + aSet);
    }
}
