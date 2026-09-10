package com.javaInterview.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyLearnings {

    public static void main(String[] args) {

        String str = "Manish K I";
        Stream<String> streamStr = Stream.of(str);
        List<String> aList = streamStr.map(String::toUpperCase).toList();
        String strArray[] = aList.toArray(new String[0]);
        System.out.println("List = " + aList);
        // Output: List = [MANISH K I]
        System.out.println("strArray = " + Arrays.toString(strArray));
        // Output: strArray = [MANISH K I]

        String string = "SomeeeStringg";
        char[] charArray = string.toCharArray();
        System.out.println("charArray = " + Arrays.toString(charArray));
        // Output: charArray = [S, o, m, e, e, e, S, t, r, i, n, g, g]

        Set<Character> aSet = new HashSet<>();
        for (char c : charArray) {
            aSet.add(c);
        }
        System.out.println("Set = " + aSet);
        // Output: Set = [r, S, t, e, g, i, m, n, o]
    }
}
