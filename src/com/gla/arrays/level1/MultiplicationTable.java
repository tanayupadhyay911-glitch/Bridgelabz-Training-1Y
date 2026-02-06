package com.gla.arrays.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to display its multiplication table: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] results = new int[10];

        for (int i = 1; i <= 10; i++) {
            results[i - 1] = number * i;
        }

        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + results[i - 1]);
        }
    }
}

