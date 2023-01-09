package com.javaInterview;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
    Interview with Charter on 2nd Dec 2021 for Denver CO location
 */

public class WordSearch {

    String[] everyWord = new String[100];
    Map<String,String> stringLinkedHashMap = new LinkedHashMap<String,String>();
    Set<String> stringSet = new LinkedHashSet<>();

    public void initialSetup(String text) {
        // Setup your data structures here
        // Do as much work here to optimize the calls on findNextWord()
        everyWord = text.split(" ");
        for(String word: everyWord){
            stringLinkedHashMap.put(word, word);
            stringSet.add(word);
        }

    }

    public String findNextWord(String word) {
        // "like" -> "cats" or "dogs"
        // "i" -> "like" or "really"
        // "foo" -> null
        String nextWord = new String();

        System.out.println("stringLinkedHashMap = " + stringLinkedHashMap);
        System.out.println("stringSet = " + stringSet);

        if(stringLinkedHashMap.containsKey(word)) {
            stringLinkedHashMap.get(word);
        }


        for (int i = 0; i < everyWord.length; i++) {
            if (everyWord[i].equalsIgnoreCase(word)) {
                nextWord = everyWord[i + 1];
                return nextWord;
            }
        }
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
