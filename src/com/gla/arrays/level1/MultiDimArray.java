package com.gla.arrays.level1;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] multiDimArray = new int[rows][columns];


        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                multiDimArray[i][j] = scanner.nextInt();
            }
        }


        System.out.println("\nOriginal 2D Array:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(multiDimArray[i]));
        }


        int[] singleDimArray = new int[rows * columns];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleDimArray[index] = multiDimArray[i][j];
                index++;
            }
        }


        System.out.println("\nCopied 1D Array:");
        System.out.println(Arrays.toString(singleDimArray));

        scanner.close();
    }
}
