package com.javaInterview;

class Rectangle{
    int x = 10;
    int y = 20;
}

public class Fannie30April2025 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = obj1;

        System.out.println(obj2.x + " " + obj2.y);

        obj1.x = 50;
        obj1.y = 60;

        System.out.println(obj2.x + " " + obj2.y);

    }

}
