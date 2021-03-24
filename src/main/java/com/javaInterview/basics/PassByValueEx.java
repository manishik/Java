package com.javaInterview.basics;

public class PassByValueEx {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Suzie");
        dog.setTailLen("Thick Tail");
        ClassThatChanges classThatChanges = new ClassThatChanges();
        Dog dog1 = classThatChanges.foo(dog);
        System.out.println("Returned Dog = " + dog1.getName() + "\t" + dog1.getTailLen());
        System.out.println(dog.getName() + "\t" + dog.getTailLen());
    }
}

class ClassThatChanges {
    public Dog foo(Dog dog) {
        dog.setName("Bubble"); // AAA
        dog.setTailLen("Long Tail");
        dog = new Dog(); // BBB
        dog.setName("Max"); // CCC
        dog.setTailLen("Short Tail");
        return dog;
    }
}

class Dog {
    String name;
    String tailLen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTailLen() {
        return tailLen;
    }

    public void setTailLen(String tailLen) {
        this.tailLen = tailLen;
    }
}