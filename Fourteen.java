/**
 * Write a program in java to print the following pattern (Hint : Use nested for
 * loop)
 *
 **
 ***
 ****
 ***** 
 */
public class Fourteen {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
