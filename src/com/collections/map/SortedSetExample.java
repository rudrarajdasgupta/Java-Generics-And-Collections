package com.collections.map;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> names = new TreeSet<>();

        // Add elements to the sorted set
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get the first and last elements in the sorted set
        String firstElement = names.first();
        String lastElement = names.last();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}
