package com.generics;

class A<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class BoundedTypeParametersExample {
    public static void main(String[] args) {
        A<Integer> integerBox = new A<>();
        integerBox.setValue(10);
        System.out.println("Integer Value: " + integerBox.getValue());

        // Error: String does not extend Number
        // Box<String> stringBox = new Box<>();
    }
}
