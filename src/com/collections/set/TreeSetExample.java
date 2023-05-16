package com.collections.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
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
