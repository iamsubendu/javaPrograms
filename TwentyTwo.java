/*
 * Write a program that takes an integer as input and converts 
 * it to a double using typecasting. Then, divide the number 
 * stored as a double by 2 and print the result.
 */

import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int integerValue = scanner.nextInt();

        // Typecasting to double
        double doubleValue = (double) integerValue;

        // Dividing the double value by 2
        double result = doubleValue / 2;

        // Printing the result
        System.out.println("Result after dividing the double value by 2: " + result);

        scanner.close();
    }
}
