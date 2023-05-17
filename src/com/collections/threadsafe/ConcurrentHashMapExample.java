package com.collections.threadsafe;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new ConcurrentHashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 77);

        // Perform thread-safe operations on the map
        scores.computeIfPresent("Alice", (name, score) -> score + 5);
        scores.putIfAbsent("Dave", 90);

        System.out.println("Scores: " + scores);
    }
}
