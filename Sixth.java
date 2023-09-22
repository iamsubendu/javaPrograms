
/**
 * Write a program in java to check whether the given number is an even number
 * or not using an if else statement. If the number is even, it should print
 * “Number is even”, otherwise it should print “Number is odd”.
 * 
 * Test Cases
 * 
 * Test Case 1
 * 
 * Input
 * 
 * 78
 * 
 * Output
 * 
 * Number is even
 * 
 * 
 * 
 * Test Case 2
 * 
 * Input
 * 
 * 63
 * 
 * Output
 * 
 * Number is odd
 * 
 * 
 * 
 * Hint : Use modulus operator to determine whether no is even or odd.
 */
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner numCheck = new Scanner(System.in);
        System.out.println("Enter a number to check if its Even/Odd");
        int number = numCheck.nextInt();
        if (number % 2 == 0) {
            System.out.println("The input no is Even");
        } else {
            System.out.println("The input no is odd");
        }
        numCheck.close();
    }
}
