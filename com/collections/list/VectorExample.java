package com.collections.list;

import java.util.Vector;

/**
 * Example demonstrating the usage of Vector in Java.
 */
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Accessing elements
        System.out.println(vector.get(1)); // Output: Banana

        // Removing an element
        vector.remove("Orange");

        // Iterating over the Vector
        for (String item : vector) {
            System.out.println(item);
        }
    }
}
