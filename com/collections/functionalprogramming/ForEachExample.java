package com.collections.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Using forEach to perform an action on each element
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
