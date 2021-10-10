package com.javaInterview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Translate {

    public static void main(String[] args) {
        //String inputString = "a,b,\"c,d\",e,f,\"g,h,d\"";
        String inputString = "a,b,\"c,d\",e,f,\"g,h,d\",i,j,\"k,l\"";
        System.out.println("InputString = " + inputString);
        String exp = "\"";
        String[] inputStrArray = inputString.split(exp);
        System.out.println(Arrays.toString(inputStrArray));
        String replacementStr = "";
        for (int i = 0; i < inputStrArray.length; i++) {
            if (!(inputStrArray[i].startsWith(",") || inputStrArray[i].endsWith(","))) {
                replacementStr = inputStrArray[i].replaceAll(",", "_");
                System.out.println("replacementStr = " + replacementStr);
                inputStrArray[i] = replacementStr;
            }
        }

        /*System.out.println(Arrays.toString(inputStrArray));
        for(String s : inputStrArray){
            System.out.println(s);
        }*/

        String finalParsedString = Arrays.stream(inputStrArray).collect(Collectors.joining());
        System.out.println("Final Parsed String = " + finalParsedString);
    }
}


