package com.collections.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Creating an iterator for the HashMap
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        // Iterating over the elements using the iterator
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}