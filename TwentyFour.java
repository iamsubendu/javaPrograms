/*
 * Write a program that takes the row & columns input 
 * from the user to populate a 2D array and then prints
 * the array.
 */

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Taking input for the number of columns
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Creating a 2D array with the given rows and columns
        int[][] matrix = new int[rows][columns];

        // Taking input for each element of the 2D array
        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("The 2D array is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();
    }
}
