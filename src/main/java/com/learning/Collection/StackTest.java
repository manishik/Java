package com.learning.Collection;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());

    }

}
