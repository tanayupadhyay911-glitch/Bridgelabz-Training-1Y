package com.gla.arrays.level1;
import java.util.Scanner;


class StudentVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10]; // Define array of 10 elements

        // Take user input for ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");
        // Check voting eligibility
        for (int i = 0; i < 10; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Not eligible to vote.");
            }
        }
        sc.close();
    }
}