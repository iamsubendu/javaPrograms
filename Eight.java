
/**
 * Write a program to interchange two numbers without using a third variable.
 * 
 * Hint: perform addition and subtraction and use the same variables to store
 * result.
 * 
 * Sample Test Case
 * 
 * Input
 * 
 * 10
 * 
 * 20
 * 
 * 
 * 
 * Output
 * 
 * 20
 * 
 * 10
 * 
 * 
 * 
 * Test Cases
 * 
 * Test Case 1
 * 
 * Input
 * 
 * 10
 * 
 * 10
 * 
 * 
 * 
 * Output
 * 
 * 10
 * 
 * 10
 * 
 * 
 * 
 * Test Case 2
 * 
 * Input
 * 
 * 7
 * 
 * 9
 * 
 * Output
 * 
 * 9
 * 
 * 7
 * 
 * 
 * 
 * Test Case 3
 * 
 * Input
 * 
 * 3
 * 
 * 4
 * 
 * Output
 * 
 * 4
 * 
 * 3
 * 
 */
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        int a = num1.nextInt();
        int b = num2.nextInt();
        System.out.println("a is now before interchange " + a);
        System.out.println("b is now before interchange " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a is now after interchange " + a);
        System.out.println("b is now after interchange " + b);
        num1.close();
        num2.close();
    }
}
