package org.example;

import java.util.Scanner;

public class Matrixresolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of N
        int N = scanner.nextInt();

        // Create a matrix to store the elements
        int[][] matrix = new int[N][N];

        // Read the matrix elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the elements in a zig-zag pattern
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                // Print elements left to right
                for (int j = 0; j < N; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Print elements right to left
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }

}
