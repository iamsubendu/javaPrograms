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
        // the syntax for (;;) represents an infinite loop.
        // It's a way of writing a loop without any explicit
        // conditions for termination, resulting in a loop that
        // continues indefinitely until an explicit break statement
        // is encountered within the loop body or the program
        // is halted using other means, such as manually
        // terminating the execution
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
