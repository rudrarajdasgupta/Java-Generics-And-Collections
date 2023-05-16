package com.collections.set;

import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(3);
        set.add(1);
        set.add(2);

        // Accessing elements
        System.out.println("Set: " + set); // Output: Set: [1, 2, 3]

        // Removing an element
        set.remove(2);

        // Checking if an element exists
        System.out.println("Contains 3: " + set.contains(3)); // Output: Contains 3: true

        // Iterating over the set
        System.out.println("Iterating over the set:");
        for (Integer item : set) {
            System.out.println(item);
        }
    }
}
