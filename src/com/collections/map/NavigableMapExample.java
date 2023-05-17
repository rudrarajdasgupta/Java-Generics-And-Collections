package com.collections.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, String> grades = new TreeMap<>();

        // Add key-value pairs to the navigable map
        grades.put(70, "C");
        grades.put(80, "B");
        grades.put(90, "A");

        // Get the entry for the given key
        NavigableMap.Entry<Integer, String> entry = grades.floorEntry(85);

        System.out.println("Grade: " + entry.getValue());
    }
}
