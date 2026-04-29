package com.gla.WraapperAssign.Scaniro;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object obj : inputs) {
            try {
                if (obj instanceof String) {
                    if (!obj.equals("null")) {
                        validMarks.add(Integer.parseInt((String) obj));
                    }
                } else if (obj instanceof Integer) {
                    validMarks.add((Integer) obj);
                }
            } catch (Exception e) {
                // ignore invalid
            }
        }

        int sum = 0;
        for (int m : validMarks) {
            sum += m;
        }

        double avg = (double) sum / validMarks.size();
        System.out.println("Average Marks = " + avg);
    }
}
