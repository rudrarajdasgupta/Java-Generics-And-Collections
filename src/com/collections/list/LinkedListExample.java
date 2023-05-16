package com.collections.list;

import java.util.LinkedList;

/**
 * Example demonstrating the usage of LinkedList in Java.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Accessing elements
        System.out.println(linkedList.get(1)); // Output: Banana

        // Removing an element
        linkedList.remove("Orange");

        // Iterating over the LinkedList
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}
