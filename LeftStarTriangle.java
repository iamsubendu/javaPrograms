
/**
*
**
***
****
*****
 */
import java.util.Scanner;

public class LeftStarTriangle {
    public static void main(String[] args) {
        Scanner nIteration = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = nIteration.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        nIteration.close();
    }
}