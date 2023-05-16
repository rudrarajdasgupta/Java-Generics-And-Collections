package com.generics;

public class Box<T> {
    private T contents;

    public void setContents(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public static void main(String[] args) {
        A<String> stringBox = new A<>();
        stringBox.setContents("Hello, Generics!");

        String message = stringBox.getContents();
        System.out.println(message);
    }
}
