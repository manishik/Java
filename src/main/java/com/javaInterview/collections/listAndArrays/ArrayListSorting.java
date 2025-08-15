package com.javaInterview.collections.listAndArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

    public static void main(String[] args) {

        List<String> arrayList = Arrays.asList("Z", "B", "C", "A", "G", "E", "X", "A", "e", "a", "u", "i", "o", "1", "0", "4", "-5");
        System.out.println("List = " + arrayList);

        Collections.sort(arrayList);
        System.out.println("List after sorting = " + arrayList);

        //Reversing the list using functions
        Collections.reverse(arrayList);
        System.out.println("List after Reversing = " + arrayList);

    }

}
