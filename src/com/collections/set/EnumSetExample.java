package com.collections.set;

import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        
        // Add an additional day
        weekdays.add(Day.SATURDAY);
        
        // Iterate over the EnumSet
        for (Day day : weekdays) {
            System.out.println(day);
        }
    }
}
