package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

        Map<String, Integer> map = new HashMap<>();

        sentence = sentence.toLowerCase();

        for (String word : sentence.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
