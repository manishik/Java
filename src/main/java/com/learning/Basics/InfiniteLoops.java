package com.learning.Basics;

public class InfiniteLoops {

    public static void main(String[] args) {
        /*for (int i = 0; i < 999999999; i++) {
            System.out.println(i);
        }*/
        int i = 0;
        /*while(true){
            i++;
            System.out.println(i);
        }*/

        for(;;){
            i++;
            System.out.println(i);
        }
    }

}
