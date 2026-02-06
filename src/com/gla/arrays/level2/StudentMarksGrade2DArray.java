package com.gla.arrays.level2;

import java.util.Scanner;

class StudentMarksGrade2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of students");
            input.close();
            return;
        }

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks of student " + (i + 1) + ": ");
            int p = input.nextInt();

            System.out.print("Enter Chemistry marks of student " + (i + 1) + ": ");
            int c = input.nextInt();

            System.out.print("Enter Maths marks of student " + (i + 1) + ": ");
            int m = input.nextInt();

            if (p < 0 || c < 0 || m < 0 || p > 100 || c > 100 || m > 100) {
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) grade[i] = "A+";
            else if (percentage[i] >= 80) grade[i] = "A";
            else if (percentage[i] >= 70) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else grade[i] = "F";
        }

        System.out.println("\nPhy\tChem\tMath\tPercent\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\t%s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        input.close();
    }
}
