package com.gla.GenericsAssignment.MapAssi.part1;

import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey);
    }
}
