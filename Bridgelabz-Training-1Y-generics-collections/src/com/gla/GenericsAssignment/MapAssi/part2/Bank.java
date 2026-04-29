package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class Bank {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("101", 5000.0);
        map.put("102", 8000.0);

        map.put("101", map.get("101") + 1000);

        if (map.get("102") >= 2000)
            map.put("102", map.get("102") - 2000);

        map.entrySet()
                .stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(System.out::println);
    }
}
