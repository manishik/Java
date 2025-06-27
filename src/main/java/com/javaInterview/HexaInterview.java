package com.javaInterview;

import java.util.Arrays;
import java.util.List;

public class HexaInterview {

    public static void main(String[] args) {

        /*List<Student> firstArray = Arrays.asList(new Student(100, "Mary"), new Student(100, "John"));
        List<Student> secondArray = Arrays.asList(new Student(100, "Mary"), new Student(100, "John"));

        boolean firstResult = firstArray.equals(secondArray);
        boolean secondResult = firstArray == secondArray;
        boolean thirdResult = firstArray.stream().allMatch(it -> {
            Student second = secondArray.get(firstArray.indexOf(it));
            return it.mark == second.mark && it.name == second.name;
        });

        System.out.println(firstResult + " " + secondResult + " " + thirdResult);*/

        try
        {
            System.out.print("hello ");
            throwit();
        }
        catch (Exception re )
        {
            System.out.print("caught ");
        }
        finally
        {
            System.out.print("finally ");
        }
        System.out.println("after ");

    }

    public static void throwit ()
    {
        System.out.print("throwit ");
        throw new RuntimeException();
    }
}

class Student {
    int mark;
    String name;

    public Student(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }
}