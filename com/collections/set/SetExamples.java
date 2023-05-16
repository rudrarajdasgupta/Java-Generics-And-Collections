package com.collections.set;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        // Set
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(3);
        set.add(1);
        set.add(2);

        // Accessing elements
        System.out.println("Set: " + set); // Output: Set: [1, 2, 3]

        // Removing an element
        set.remove(2);

        // Checking if an element exists
        System.out.println("Contains 3: " + set.contains(3)); // Output: Contains 3: true

        // Iterating over the set
        System.out.println("Iterating over the set:");
        for (Integer item : set) {
            System.out.println(item);
        }
        System.out.println();

        // HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the hashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Accessing elements
        System.out.println("HashSet: " + hashSet); // Output: HashSet: [Apple, Orange, Banana]

        // Removing an element
        hashSet.remove("Orange");

        // Iterating over the hashSet
        System.out.println("Iterating over the HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }
        System.out.println();

        // LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the linkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // Accessing elements
        System.out.println("LinkedHashSet: " + linkedHashSet); // Output: LinkedHashSet: [Apple, Banana, Orange]

        // Removing an element
        linkedHashSet.remove("Orange");

        // Iterating over the linkedHashSet
        System.out.println("Iterating over the LinkedHashSet:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }
        System.out.println();

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the treeSet
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        // Accessing elements
        System.out.println("TreeSet: " + treeSet); // Output: TreeSet: [1, 2, 3]

        // Removing an element
        treeSet.remove(2);

        // Checking the size
        System.out.println("Size of TreeSet: " + treeSet.size()); // Output: Size of TreeSet: 2

        // Iterating over the treeSet
        System.out.println("Iterating over the TreeSet:");
        for (Integer item : treeSet) {
            System.out.println(item);
        }
    }
}
