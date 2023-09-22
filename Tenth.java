
/**
 * Create a basic Switch case statement which will handle the following cases:
 * 
 * if number is 1 : it should display "neither prime nor composite"
 * 
 * if number is 2 : it should display "no is prime"
 * 
 * if number is 4 : it should display "no is composite"
 */
import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a no to check prime or composite no.");
        int number = num.nextInt();
        if (number == 1) {
            System.out.println("Neither prime nor composite no.");
        } else if (number % 2 == 0) {
            System.out.println("Number provided is composite no.");
        } else {
            System.out.println("Number provided is prime no.");
        }
        num.close();
    }
}
