package com.collections.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the treeMap
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);

        // Accessing values by key
        System.out.println("Value of Banana: " + treeMap.get("Banana")); // Output: Value of Banana: 2

        // Removing a
    }
}