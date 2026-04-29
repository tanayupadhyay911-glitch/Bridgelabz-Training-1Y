package com.gla.WraapperAssign;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67;

        // Convert to primitive double
        double d = obj;

        // Convert to int using casting
        int i = (int) d;

        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + i);
    }
}
