package com.collections.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the hashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Accessing elements
        System.out.println("HashSet: " + hashSet); // Output: HashSet: [Apple, Orange, Banana]

        // Removing an element
        hashSet.remove("Orange");

        // Iterating over the hashSet
        System.out.println("Iterating over the HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }
    }
}
