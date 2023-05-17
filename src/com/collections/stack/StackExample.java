package com.collections.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        while (!stack.isEmpty()) {
            String item = stack.pop();
            System.out.println(item);
        }
    }
}
