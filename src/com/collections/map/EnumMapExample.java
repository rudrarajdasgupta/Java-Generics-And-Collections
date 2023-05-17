package com.collections.map;

import java.util.EnumMap;
import java.util.Map;

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Month, String> seasonMap = new EnumMap<>(Month.class);
        
        // Add seasons to the EnumMap
        seasonMap.put(Month.JANUARY, "Winter");
        seasonMap.put(Month.APRIL, "Spring");
        seasonMap.put(Month.JULY, "Summer");
        seasonMap.put(Month.OCTOBER, "Autumn");
        
        // Iterate over the EnumMap
        for (Map.Entry<Month, String> entry : seasonMap.entrySet()) {
            Month month = entry.getKey();
            String season = entry.getValue();
            System.out.println(month + ": " + season);
        }
    }
}
