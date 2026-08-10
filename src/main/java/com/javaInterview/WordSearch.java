package com.javaInterview;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/*
    Interview with Charter on 2nd Dec 2021 for Denver CO location
 */

public class WordSearch {

    private final Map<String, Set<String>> nextWords = new LinkedHashMap<>();

    public void initialSetup(String text) {
        // Setup your data structures here
        // Do as much work here to optimize the calls on findNextWord()
        nextWords.clear();
        if (text == null || text.isBlank()) {
            return;
        }
        String[] everyWord = text.trim().split("\\s+");
        for (int i = 0; i < everyWord.length - 1; i++) {
            String word = everyWord[i].toLowerCase(Locale.ROOT);
            nextWords.computeIfAbsent(word, ignored -> new LinkedHashSet<>()).add(everyWord[i + 1]);
        }
    }

    public String findNextWord(String word) {
        // "like" -> "cats" or "dogs"
        // "i" -> "like" or "really"
        // "foo" -> null
        if (word == null) {
            return null;
        }
        Set<String> candidates = nextWords.get(word.toLowerCase(Locale.ROOT));
        return candidates == null ? null : candidates.iterator().next();
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
