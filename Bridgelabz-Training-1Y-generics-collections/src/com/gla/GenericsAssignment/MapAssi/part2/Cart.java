package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class Cart {
    public static void main(String[] args) {

        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 4000.0);
        cart.put("Phone", 2000.0);

        double total = 0;

        for (double price : cart.values())
            total += price;

        if (total > 5000)
            total *= 0.9;

        System.out.println("Total " + total);
    }
}
