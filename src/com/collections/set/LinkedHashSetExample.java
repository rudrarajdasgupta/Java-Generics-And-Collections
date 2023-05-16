package com.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the linkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // Accessing elements
        System.out.println("LinkedHashSet: " + linkedHashSet); // Output: LinkedHashSet: [Apple, Banana, Orange]

        // Removing an element
        linkedHashSet.remove("Orange");

        // Iterating over the linkedHashSet
        System.out.println("Iterating over the LinkedHashSet:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }
    }
}
