
/**
 * Write a program in java to implement a basic calculator using switch case
 * statement
 * 
 * Accept two no as user input and print the result based on operation.
 * 
 * Display list of options
 * 
 * 1 → addition
 * 
 * 2 → subtraction
 * 
 * 3 → multiplication
 * 
 * 4 → division
 * 
 * Perform division only if the second number is not equal to 0. If the second
 * number is 0 print “Cannot be divided” on console.
 */

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner twoValues = new Scanner(System.in);
        System.out.println("Enter a integer");
        int val1 = twoValues.nextInt();
        System.out.println("Enter another integer");
        int val2 = twoValues.nextInt();
        System.out.println("Enter either 1.to Add 2.to Subtract 3.to Multiply 4.to Divide");
        int val3 = twoValues.nextInt();
        switch (val3) {
            case 1:
                System.out.println(val1 + val2);
                break;
            case 2:
                System.out.println(val1 - val2);
                break;
            case 3:
                System.out.println(val1 * val2);
                break;
            case 4:
                System.out.println(val1 / val2);
                break;
            default:
                System.out.println("Please select valid option");
        }
        twoValues.close();
    }
}
