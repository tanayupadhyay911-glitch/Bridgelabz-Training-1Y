package com.gla.GenericsAssignment.MapAssi.part2;
import java.util.*;

public class EmployeeDept {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "HR");
        map.put(2, "IT");

        map.put(1, "Finance");

        for (Integer id : map.keySet()) {
            if (map.get(id).equals("IT"))
                System.out.println(id);
        }
    }
}
