package com.collections.map;

import java.util.Map;
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

        // Removing a key-value pair
        treeMap.remove("Orange");

        // Checking the size
        System.out.println("Size of TreeMap: " + treeMap.size()); // Output: Size of TreeMap: 2

        // Iterating over the treeMap
        System.out.println("Iterating over the TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " => " + value);
        }
    }
}