package com.javaInterview;

import java.util.HashSet;
import java.util.Set;

public class TwoStringHaveSameCharacters {

    public static void main(String[] args) {
        String S1 = "aabbc";
        String S2 = "bcaba";
        System.out.println("Do both strings have the same characters? " + haveSameCharacters(S1, S2));
    }

    public static boolean haveSameCharacters(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : s1.toCharArray()) {
            set1.add(c);
        }

        System.out.println("Set1 = " + set1);
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }
        System.out.println("Set2 = " + set2);
        return set1.equals(set2);
    }

}

// This Program costed me Mphasis on 26th Feb 2025
