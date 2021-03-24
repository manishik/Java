package com.javaInterview.interviewQs;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> premiumPhone = new ConcurrentHashMap<String, String>();
        premiumPhone.put("Apple", "iPhones");
        premiumPhone.put("Samsung", "Galaxy-S-Series");
        premiumPhone.put("HTC", "HTC-Series");

        System.out.println("Initial Cell Phone List = " + premiumPhone);

        Iterator iterator = premiumPhone.keySet().iterator();

        //Adding new object while iterating a collection
        while (iterator.hasNext()) {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia-Series");
        }

        Iterator iterator2 = premiumPhone.keySet().iterator();
        System.out.print("New Cell Phone List : ");
        while (iterator2.hasNext()) {
            System.out.print(premiumPhone.get(iterator2.next()) + "\t");
        }
		System.out.println();
		System.out.println("Cell Phone List = " + premiumPhone);
    }
}


/*
										Fail Fast Iterator  		Fail Safe Iterator

Throw ConcurrentModification Exception 	Yes 						No 
Clone object  							No 							Yes 
Memory Overhead 						No 							Yes 
Examples 								HashMap,Vector,				CopyOnWriteArrayList, ConcurrentHashMap
										ArrayList,HashSet 
*/