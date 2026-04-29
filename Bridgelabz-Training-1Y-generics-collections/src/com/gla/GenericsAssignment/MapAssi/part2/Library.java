package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class Library {
    public static void main(String[] args) {

        Map<String, String> books = new TreeMap<>();

        books.put("111", "Java");
        books.put("222", "Python");

        System.out.println(books.getOrDefault("111", "Not Found"));

        books.remove("222");

        for (Map.Entry<String, String> e : books.entrySet()) {
            System.out.println(e);
        }
    }
}
