package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionExample {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");

        List<String> unmodifiableList = Collections.unmodifiableList(originalList);

        // Trying to modify the unmodifiable list will throw an UnsupportedOperationException
        try {
            unmodifiableList.add("Mango");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable list.");
        }

        // Original list can still be modified
        originalList.add("Mango");

        System.out.println("Original List: " + originalList);
        System.out.println("Unmodifiable List: " + unmodifiableList);
    }
}
