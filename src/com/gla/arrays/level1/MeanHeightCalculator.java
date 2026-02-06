package com.gla.arrays.level1;

import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter the heights of 11 football players (in your preferred unit):");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        for (double height : heights) {
            sum += height;
        }

        double mean = sum / heights.length;


        System.out.printf("The sum of all heights is: %.2f\n", sum);
        System.out.printf("The mean height of the football team is: %.2f\n", mean);

        scanner.close();
    }
}
