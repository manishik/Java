package com.javaInterview;

import java.math.BigInteger;

public class MatchRandomNumber {

    public static void main(String[] args) {

        BigInteger secretCode = new BigInteger("1234567890123456789012");
        System.out.println("secretCode = " + secretCode);
        char charArray[] = secretCode.toString().toCharArray();

        String result = new String();
        char resultArray[] = new char[0];

        for (int i = 0; i <= charArray.length; i++) {
            for (char c : charArray) {
                if (i == c) {
                    resultArray[i] = c;
                }
            }
        }

        System.out.println(resultArray);

    }

}
