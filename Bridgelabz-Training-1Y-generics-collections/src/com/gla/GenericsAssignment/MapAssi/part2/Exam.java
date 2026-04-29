package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class Exam {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> map = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("A", 95);
        math.put("B", 80);

        map.put("Math", math);

        for (String subject : map.keySet()) {

            Map<String, Integer> students = map.get(subject);

            String topper = Collections.max(
                    students.entrySet(),
                    Map.Entry.comparingByValue()
            ).getKey();

            System.out.println(subject + " Topper " + topper);
        }
    }
}
