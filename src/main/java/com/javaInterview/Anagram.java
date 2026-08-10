package com.javaInterview;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Manish is a jack ass";
		String str2 = "Jack as is as Manish";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("Are the strings anagrams? == " + isAnagram(str1, str2));
	}

	public static boolean isAnagram(String first, String second) {
		if (first == null || second == null) {
			return false;
		}

		String normalizedFirst = first.replaceAll("\\s", "").toLowerCase(Locale.ROOT);
		String normalizedSecond = second.replaceAll("\\s", "").toLowerCase(Locale.ROOT);
		if (normalizedFirst.length() != normalizedSecond.length()) {
			return false;
		}

		Map<Character, Integer> counts = new HashMap<>();
		for (char character : normalizedFirst.toCharArray()) {
			counts.merge(character, 1, Integer::sum);
		}
		for (char character : normalizedSecond.toCharArray()) {
			Integer count = counts.get(character);
			if (count == null || count == 0) {
				return false;
			}
			counts.put(character, count - 1);
		}
		return true;
	}

}
