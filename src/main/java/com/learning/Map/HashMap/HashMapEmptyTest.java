package com.learning.Map.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapEmptyTest {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(7, "Seven");
        hashMap.put(new Integer(3), "Three");
        hashMap.put(new Integer(2), "Two");
        hashMap.put(6, "Six");
        hashMap.put(new Integer(4), "Four");
        hashMap.put(new Integer(1), "One");
        hashMap.put(new Integer(5), "Five");

        Map<Integer, String> nonModifiableHM = Collections.unmodifiableMap(hashMap);

        for (Integer key : nonModifiableHM.keySet()) {
            System.out.println("Key = " + key + ", Value = " + nonModifiableHM.get(key));
        }

        nonModifiableHM.put(new Integer(8), "Eight");

        for (Integer key : nonModifiableHM.keySet()) {
            System.out.println("Key = " + key + ", Value = " + nonModifiableHM.get(key));
        }

    }

}
