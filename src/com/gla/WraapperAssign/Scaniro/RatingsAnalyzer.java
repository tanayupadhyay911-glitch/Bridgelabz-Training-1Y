package com.gla.WraapperAssign.Scaniro;

import java.util.*;

public class RatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {4, 5, 3};
        ArrayList<Integer> wrapperRatings = new ArrayList<>();
        wrapperRatings.add(5);
        wrapperRatings.add(null);
        wrapperRatings.add(4);

        ArrayList<Integer> allRatings = new ArrayList<>();

        for (int r : primitiveRatings) {
            allRatings.add(r); // auto-boxing
        }

        allRatings.addAll(wrapperRatings);

        int sum = 0, count = 0;

        for (Integer r : allRatings) {
            if (r != null) {
                sum += r; // auto-unboxing
                count++;
            }
        }

        double avg = (double) sum / count;
        System.out.println("Average Rating = " + avg);
    }
}
