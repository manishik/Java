package com.javaInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyMatch {

    public static void main(String[] args) {
        String input = "zzzxaaaabbbxddaaaabbbccddx";

        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        // Regular expression to match consecutive repeating characters
        Pattern pattern = Pattern.compile("(.)\\1*");
        Matcher matcher = pattern.matcher(input);

        // Iterate through matches and count occurrences
        while (matcher.find()) {
            String match = matcher.group();
            frequencyMap.put(match, frequencyMap.getOrDefault(match, 0) + 1);
        }

        // Print the result
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}

/*
Explanation
	1.	Regex (.)\\1*
        •	(.) → Captures any character.
	    •	\\1* → Matches the same character repeatedly.
	    •	This helps in identifying continuous repeating substrings.
	2.	Using Matcher.find()
	    •	It finds all substrings where characters repeat.
	3.	Storing in LinkedHashMap
	    •	This maintains the insertion order.
	    •	If a substring appears multiple times in different places, we count its occurrences.*/
