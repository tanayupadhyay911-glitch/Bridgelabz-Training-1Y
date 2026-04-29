package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {

        Map<String, Double> grades = new TreeMap<>();

        grades.put("Alice", 85.5);
        grades.put("Bob", 75.0);
        grades.put("Charlie", 90.0);

        grades.put("Bob", 80.0);

        grades.remove("Charlie");

        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
