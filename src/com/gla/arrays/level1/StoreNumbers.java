package com.gla.arrays.level1;

import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        // a. Create array, total (initialized to 0.0), and index (initialized to 0)
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 10 numbers (enter 0 or negative to stop):");

        // b. Use infinite while loop
        while (true) {
            // d. Check if index has reached 10 (array capacity)
            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            System.out.print("Enter number " + (index + 1) + ": ");
            double entry = scanner.nextDouble();

            // c. Break loop if user enters 0 or a negative number
            if (entry <= 0) {
                break;
            }

            // e. Assign number to array and increment index
            numbers[index] = entry;
            index++;
        }

        // f. Use a for loop to get values and calculate total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // g. Display the total value
        System.out.println("----------------");
        System.out.println("Total Sum: " + total);

        scanner.close();
    }
}
