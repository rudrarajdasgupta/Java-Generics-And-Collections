package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class CustomComparatorExample {
    public static void main(String[] args) {
        Comparator<Person> byAge = Comparator.comparingInt(Person::getAge);
        TreeSet<Person> peopleByAge = new TreeSet<>(byAge);
        peopleByAge.add(new Person("Alice", 25));
        peopleByAge.add(new Person("Bob", 30));
        peopleByAge.add(new Person("Charlie", 20));

        System.out.println("People sorted by age: " + peopleByAge);

        Comparator<Person> byName = Comparator.comparing(Person::getName);
        TreeSet<Person> peopleByName = new TreeSet<>(byName);
        peopleByName.add(new Person("Alice", 25));
        peopleByName.add(new Person("Bob", 30));
        peopleByName.add(new Person("Charlie", 20));

        System.out.println("People sorted by name: " + peopleByName);
    }
}
