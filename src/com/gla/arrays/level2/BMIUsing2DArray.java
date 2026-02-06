package com.gla.arrays.level2;

import java.util.Scanner;

class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of persons");
            input.close();
            return;
        }

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

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

            personData[i][0] = w;
            personData[i][1] = h;
        }

        for (int i = 0; i < n; i++) {
            double w = personData[i][0];
            double h = personData[i][1];

            personData[i][2] = w / (h * h);

            double bmi = personData[i][2];

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    personData[i][1],
                    personData[i][0],
                    personData[i][2],
                    weightStatus[i]);
        }

        input.close();
    }
}
