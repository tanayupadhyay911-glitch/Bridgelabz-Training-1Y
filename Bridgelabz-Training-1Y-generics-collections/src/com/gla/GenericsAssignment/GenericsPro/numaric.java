package com.gla.GenericsAssignment.GenericsPro;

import java.util.*;

class SumNumbers {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number num : list) {
            sum += num.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4);
        List<Double> dblList = Arrays.asList(1.1,2.2,3.3);

        System.out.println(sumNumbers(intList));
        System.out.println(sumNumbers(dblList));
    }
}
