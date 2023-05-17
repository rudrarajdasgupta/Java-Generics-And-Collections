package com.collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> scores = new TreeMap<>();

        // Add key-value pairs to the sorted map
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 77);

        // Get the first and last entry in the sorted map
        SortedMap.Entry<String, Integer> firstEntry = ((TreeMap<String, Integer>) scores).firstEntry();
        SortedMap.Entry<String, Integer> lastEntry = ((TreeMap<String, Integer>) scores).lastEntry();

        System.out.println("First Entry: " + firstEntry.getKey() + " - " + firstEntry.getValue());
        System.out.println("Last Entry: " + lastEntry.getKey() + " - " + lastEntry.getValue());
    }
}
