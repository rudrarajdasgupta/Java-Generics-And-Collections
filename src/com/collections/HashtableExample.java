package com.collections;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> scores = new Hashtable<>();

        // Add key-value pairs to the hashtable
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 77);

        // Get the value for the given key
        int bobScore = scores.get("Bob");

        System.out.println("Bob's Score: " + bobScore);
    }
}
