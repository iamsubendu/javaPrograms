/**
 * Write a basic for loop program to print odd numbers lying in range 1 to 10.
 * 
 * hint: use i = i+2 in syntax, initialize i =1; run till range 10;
 */
public class Twelve {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 1; i <= numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
