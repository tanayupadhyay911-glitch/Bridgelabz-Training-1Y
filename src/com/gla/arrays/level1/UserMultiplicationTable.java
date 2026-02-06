package com.gla.arrays.level1;

import java.util.Scanner;

public class UserMultiplicationTable {
    public static void main(String[] args) {
        // a. Take integer input and store in 'number'
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its multiplication table (6-9): ");
        int number = scanner.nextInt();

        // a. Define an integer array to store the result (for range 6 to 9, we need 4 slots)
        // Array index 0 = 6th, 1 = 7th, 2 = 8th, 3 = 9th
        int[] multiplicationResult = new int[4];

        // b. Using a for loop, find multiplication table from 6 to 9 and save to array
        for (int i = 6; i <= 9; i++) {
            // Saving the result. We adjust index to 0-3
            multiplicationResult[i - 6] = number * i;
        }

        // c. Display the result from the array in the format number * i = ___
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}
    