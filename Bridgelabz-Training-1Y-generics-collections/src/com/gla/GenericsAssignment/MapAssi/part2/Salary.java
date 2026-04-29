package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class Salary {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("A", 50000.0);
        map.put("B", 60000.0);

        map.put("A", map.get("A") * 1.1);

        double avg = map.values().stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0);

        System.out.println("Average " + avg);
    }
}
