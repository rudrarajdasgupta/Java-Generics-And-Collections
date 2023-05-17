package com.collections;

public class ArrayUtil {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};

        System.out.println("Numbers:");
        printArray(numbers);

        System.out.println("Names:");
        printArray(names);
    }
}
