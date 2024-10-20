package com.java8.lambda;

@FunctionalInterface
interface MyString {

    String reverseString(String string);

    static String aMethod() {
        return "Static aMethod";
    }

    default int addMethod(int a, int b) {
        return a + b;
    }
}

public class LambdaReverseStr {
    public static void main(String[] args) {
        // Block lambda to reverse string
        MyString myString = (string) -> {
            String result = "";

            for (int i = string.length() - 1; i >= 0; i--)
                result += string.charAt(i);

            return result;
        };

        // Output:
        System.out.println(myString.reverseString("Lambda Reverse String Demo"));
    }
}
