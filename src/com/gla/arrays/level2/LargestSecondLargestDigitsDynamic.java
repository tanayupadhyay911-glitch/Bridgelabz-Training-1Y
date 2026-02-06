package com.gla.arrays.level2;

import java.util.Scanner;

class LargestSecondLargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        if (number < 0) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        if (number == 0) {
            digits[index++] = 0;
        } else {
            while (number != 0) {
                if (index == maxDigit) {
                    maxDigit += 10;
                    int[] temp = new int[maxDigit];
                    for (int i = 0; i < digits.length; i++) temp[i] = digits[i];
                    digits = temp;
                }

                digits[index] = (int) (number % 10);
                number /= 10;
                index++;
            }
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        input.close();
    }
}

