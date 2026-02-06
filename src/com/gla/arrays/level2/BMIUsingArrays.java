package com.gla.arrays.level2;

import java.util.Scanner;

class BMIUsingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of persons");
            input.close();
            return;
        }

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            double w = input.nextDouble();

            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            double h = input.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            weight[i] = w;
            height[i] = h;
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", height[i], weight[i], bmi[i], status[i]);
        }

        input.close();
    }
}
