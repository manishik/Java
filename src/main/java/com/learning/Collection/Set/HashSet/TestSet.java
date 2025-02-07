package com.learning.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
        String str = "2345678901234561";
        long ccNumber = Long.valueOf(str);
        TestSet testSet = new TestSet();

        testSet.doesCCExistsInDB(ccNumber);
    }

    Set validCCs = new HashSet<String>();
    public boolean doesCCExistsInDB(Long CCNumber){
        createValidCCs();
        if(validCCs.contains(CCNumber.toString())){
            //return "Valid Credit Card Number";
            System.out.println("CC number is valid");
            return true;
        }
        System.out.println("CC number is in-valid");
        return false;
    }

    public void createValidCCs() {
        validCCs.add("0123456789012345");
        validCCs.add("1234567890123456");
        validCCs.add("2345678901234561");
        validCCs.add("3456789012345612");
        validCCs.add("4567890123456123");
        validCCs.add("5678901234561234");
    }
}
