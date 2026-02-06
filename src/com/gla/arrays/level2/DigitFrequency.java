package com.gla.arrays.level2;

import java.util.Scanner;

class DigitFrequency {
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

        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + freq[i]);
        }

        input.close();
    }
}
