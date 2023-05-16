package com.collections.iterator;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class LinkedHashMapIteratorExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Creating an iterator for the LinkedHashMap
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
