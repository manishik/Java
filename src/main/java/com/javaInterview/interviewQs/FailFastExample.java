package com.javaInterview.interviewQs;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {
    public static void main(String[] args) {
        Map<String, String> premiumPhone = new HashMap<String, String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung", "S5");

        //Iterator iterator = premiumPhone.keySet().iterator();

        /*try {
            while (iterator.hasNext()) {
                System.out.println(premiumPhone.get(iterator.next()));
                premiumPhone.put("Sony", "Xperia Z");
            }
        } catch (ConcurrentModificationException concurrentModificationException) {
            concurrentModificationException.printStackTrace();
        }*/

        try {
            for (String key : premiumPhone.keySet()) {
                System.out.println("Key: " + key + " | Value: " + premiumPhone.get(key));
                premiumPhone.put("Sony", "Xperia Z");
            }
        } catch (ConcurrentModificationException concurrentModificationException) {
            concurrentModificationException.printStackTrace();
        }

    }

}
