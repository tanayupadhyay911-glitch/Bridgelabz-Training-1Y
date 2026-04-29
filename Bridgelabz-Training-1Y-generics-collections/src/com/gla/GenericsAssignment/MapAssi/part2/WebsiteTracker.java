package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class WebsiteTracker {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        String[] visits = {
                "home", "about", "products",
                "home", "products", "contact", "home"
        };

        for (String page : visits) {
            map.put(page, map.getOrDefault(page, 0) + 1);
        }

        map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .forEach(System.out::println);
    }
}
