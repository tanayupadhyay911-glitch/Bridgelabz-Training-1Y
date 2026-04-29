package com.gla.WraapperAssign;

public class WrapperUtilities {
    public static void main(String[] args) {
        int intVal = Integer.parseInt("123");
        double doubleVal = Double.parseDouble("3.14");
        boolean boolVal = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println("Integer: " + intVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Boolean: " + boolVal);
        System.out.println("Binary of 10: " + binary);
        System.out.println("Is '5' a digit? " + isDigit);
        System.out.println("Uppercase of 'a': " + upper);
    }
}
