package com.javaInterview.string;

public class FindAWordInSentence {

    public static void main(String[] args) {
        String findWord = "Maish";
        String sentence = "This is a sentence where word Manish has to be found";
        String[] everyWordInSentence = sentence.split(" ");
        System.out.println("Next word after " + findWord + " is " + search(everyWordInSentence, findWord));
    }

    public static String search(String[] everyWordInSentence, String findWord) {
        for (int i = 0; i < everyWordInSentence.length; i++) {
            if(findWord.equalsIgnoreCase(everyWordInSentence[i])){
                return everyWordInSentence[i+1];
            }
        }
        return "Empty (Not Found)";
    }

}
