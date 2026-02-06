package com.gla.arrays.level2;

import java.util.Scanner;

class ZaraBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalEmployees = 10;

        double[] salary = new double[totalEmployees];
        double[] years = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < totalEmployees; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double sal = input.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            double yr = input.nextDouble();

            if (sal <= 0 || yr < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }

        for (int i = 0; i < totalEmployees; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Years: " + years[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
