package com.gla.arrays.level1;

import java.util.Arrays;
import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive integer to find its factors: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.err.println("Please enter a positive integer.");
            scanner.close();
            return;
        }


        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;


        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if the index is equal to maxSize, then need factors array to store more elements
                if (index == maxSize) {

                    maxSize *= 2;
                    int[] tempArray = new int[maxSize];
                    System.arraycopy(factors, 0, tempArray, 0, factors.length);
                    factors = tempArray;
                }
                factors[index++] = i;
            }
        }
// Use Arrays.copyOf to create a final array with the correct size before printing
        int[] finalFactors = Arrays.copyOf(factors, index);
        System.out.println("The factors of " + number + " are: " + Arrays.toString(finalFactors));

        scanner.close();
    }
}
