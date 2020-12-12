package com.learning.Collection.List;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> stringCopyOnWriteArrayList = new CopyOnWriteArrayList<String>();

        // Initial Iterator
        Iterator itr = stringCopyOnWriteArrayList.iterator();
        System.out.print("1. List contains: ");
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println();
        stringCopyOnWriteArrayList.add("Manish");
        stringCopyOnWriteArrayList.add("Indudhar");
        stringCopyOnWriteArrayList.add("Keshav");
        stringCopyOnWriteArrayList.remove(1);
        // iterator after adding an element
        itr = stringCopyOnWriteArrayList.iterator();
        System.out.print("2. List contains: ");
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }

}
