/*
 * Write a program that takes an integer as input and 
 * calculates the sum of its digits using a while loop.
 */

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0;
        int originalNumber = number; // Store the original number for later display

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        // Printing the result
        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);

        scanner.close();
    }
}
