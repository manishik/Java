package com.javaInterview;

import java.util.HashSet;

/*
    Interview with Charter on 2nd Dec 2021 for Denver CO location
 */

public class WordSearch {

    String[] everyWord = new String[100];
    HashSet<String[]> hashSet = new HashSet();

    public void initialSetup(String text) {
        // Setup your data structures here
        // Do as much work here to optimize the calls on findNextWord()
        everyWord = text.split(" ");
        hashSet.add(text.split(" "));
    }

    public String findNextWord(String word) {
        // "like" -> "cats" or "dogs"
        // "i" -> "like" or "really"
        // "foo" -> null
        String nextWord = new String();

        //System.out.println(everyWord.length);
        for (int i = 0; i < everyWord.length; i++) {
            System.out.println("Inside");
            System.out.println("everyWord = " + everyWord[i]);
            if (everyWord[i].equalsIgnoreCase(word)) {
                //System.out.println("Word Found");
                nextWord = everyWord[i + 1];
                //System.out.println("nexWord = " + nextWord);
                return nextWord;
            }
        }

        System.out.println("HashSet = " + hashSet);

        if (hashSet.contains(word)) {

        }
        //System.out.println("Word Not Found");
        return null;
    }

    public static void main(String[] args) {
        WordSearch w = new WordSearch();

        w.initialSetup("i like cats i like dogs but i really like cats");
        // It should return "cats" or "dogs"
        System.out.println("like -> " + w.findNextWord("like"));
        // It should return "like" or "really"
        System.out.println("i -> " + w.findNextWord("i"));
    }
}
