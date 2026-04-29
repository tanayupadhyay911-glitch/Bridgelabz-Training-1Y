package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class Inventory {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Laptop", 10);
        inventory.put("Phone", 5);

        inventory.put("Laptop", inventory.get("Laptop") - 5);

        inventory.put("Phone", inventory.get("Phone") + 10);

        System.out.println(inventory);

        for (String item : inventory.keySet()) {
            if (inventory.get(item) <= 0) {
                System.out.println(item + " Out of Stock");
            }
        }
    }
}
