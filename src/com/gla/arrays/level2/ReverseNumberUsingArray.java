package com.gla.arrays.level2;

import java.util.Scanner;

class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        if (number < 0) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        long temp = number;
        int count = 0;

        if (temp == 0) count = 1;
        else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        int[] digits = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = (int) (number % 10);
            number /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}
