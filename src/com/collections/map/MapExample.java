package com.collections.map;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Accessing values by key
        System.out.println("Value of Banana: " + map.get("Banana")); // Output: Value of Banana: 2

        // Removing a key-value pair
        map.remove("Orange");

        // Checking if a key exists
        System.out.println("Contains Apple: " + map.containsKey("Apple")); // Output: Contains Apple: true

        // Iterating over the map
        System.out.println("Iterating over the map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " => " + value);
        }
    }
}
