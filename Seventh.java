
/**
 * Write a java program to check whether a year is a leap year or not.
 * 
 * 
 * 
 * A year is a leap year if the following conditions are satisfied
 * 
 * The year is multiple of 400.
 * The year is multiple of 4 and not multiple of 100
 * 
 * 
 * Sample Test Case
 * 
 * Input
 * 
 * 1111
 * 
 * 
 * 
 * Output
 * 
 * Not a leap year
 * 
 * 
 * 
 * Explanation: Not divisible by 4
 */
import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner yearIn = new Scanner(System.in);
        System.out.println("Enter a year to check whether is a leap year");
        int year = yearIn.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Entered year is a leap year");
        } else {
            System.out.println("Entered year isn't a leap year");
        }
        yearIn.close();
    }
}
