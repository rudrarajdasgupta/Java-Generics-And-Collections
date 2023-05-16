package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs to the linkedHashMap
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Orange", 3);

        // Accessing values by key
        System.out.println("Value of Banana: " + linkedHashMap.get("Banana")); // Output: Value of Banana: 2

        // Removing a key-value pair
        linkedHashMap.remove("Orange");

        // Iterating over the linkedHashMap
        System.out.println("Iterating over the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " => " + value);
        }
    }
}
