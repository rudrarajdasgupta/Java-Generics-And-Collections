package com.prerequisites;

import java.util.Arrays;
import java.util.Comparator;

//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}

public class ComparatorExample {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 20)
        };

        Comparator<Person> byAge = Comparator.comparingInt(Person::getAge);
        Arrays.sort(people, byAge);

        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
