package com.gla.arrays.level1;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Hint a: Check for Natural Number. If not a natural number then print an error and exit
        if (number < 1) {
            System.err.println("Error: Please enter a natural number (an integer greater than 0).");
            scanner.close();
            return;
        }

        // Hint b: Create an integer array for even and odd numbers with size = number / 2 + 1
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Hint c: Create index variables for odd and even numbers and initialize them to zero
        int evenIndex = 0;
        int oddIndex = 0;

        // Hint d: Using a for loop, iterate from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Save the even number into the corresponding array
                evenNumbers[evenIndex++] = i;
            } else {
                // Save the odd number into the corresponding array
                oddNumbers[oddIndex++] = i;
            }
        }

        // Hint e: Finally, print the odd and even numbers array using the odd and even index
        // We use Arrays.copyOf to only print the filled portions of the arrays.
        System.out.println("Even numbers: " + Arrays.toString(Arrays.copyOf(evenNumbers, evenIndex)));
        System.out.println("Odd numbers: " + Arrays.toString(Arrays.copyOf(oddNumbers, oddIndex)));

        scanner.close();
    }
}
