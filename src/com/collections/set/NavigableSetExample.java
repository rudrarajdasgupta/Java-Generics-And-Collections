package com.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Add elements to the navigable set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get the greatest element less than or equal to the given element
        int floorElement = numbers.floor(25);

        System.out.println("Floor Element: " + floorElement);
    }
}
