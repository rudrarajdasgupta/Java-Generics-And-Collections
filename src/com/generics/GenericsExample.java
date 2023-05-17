package com.generics;

public class GenericsExample {
    public static void main(String[] args) {
        // Create a Box of String type
        Box<String> stringBox = new Box<>();

        // Set and get the item in the Box
        stringBox.setItem("Hello, Generics!");
        String item = stringBox.getItem();
        System.out.println(item);
    }
}
