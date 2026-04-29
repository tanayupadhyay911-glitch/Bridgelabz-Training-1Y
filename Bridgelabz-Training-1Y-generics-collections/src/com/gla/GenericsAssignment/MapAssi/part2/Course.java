package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class Course {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("CS101", 45);
        map.put("CS102", 60);

        for (String course : map.keySet()) {
            if (map.get(course) >= 50)
                System.out.println("Near Full: " + course);

            if (map.get(course) < 5)
                System.out.println("Under Subscribed: " + course);
        }
    }
}
