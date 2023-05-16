package com.collections.threadsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafeExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Fail-Fast Iterator (Throws ConcurrentModificationException)
        Iterator<String> failFastIterator = names.iterator();
        while (failFastIterator.hasNext()) {
            String name = failFastIterator.next();
            if (name.equals("Bob")) {
                names.remove(name);
            }
        }

        // Fail-Safe Iterator (Does not throw ConcurrentModificationException)
        Iterator<String> failSafeIterator = new CopyOnWriteArrayList<>(names).iterator();
        while (failSafeIterator.hasNext()) {
            String name = failSafeIterator.next();
            if (name.equals("Bob")) {
                names.remove(name);
            }
        }

        System.out.println("Modified Names: " + names);
    }
}
