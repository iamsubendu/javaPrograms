/**
 * Program to implement the continue and break functionality
 * 
 * Create a program to print the table of 2. Create an infinite for loop, use
 * continue if number doesn't come in table of 2, and break if the loop variable
 * exceeds 20.
 * 
 */
public class Ninteen {
    public static void main(String[] args) {
        int i = 1;
        for (;; i++) {
            if (i % 2 != 0)
                continue;
            else if (i > 20)
                break;
            else
                System.out.println(i);
        }
    }
}
