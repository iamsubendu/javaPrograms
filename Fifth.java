import java.util.Scanner;
// for taking input

public class Fifth {
    public static void main(String[] args) {
        Scanner intValue = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = intValue.nextInt();
        if (age >= 60) {
            System.out.println("You are eligible to vote And a responsible senior citizen!");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You aren't eligible to vote!");
        }
        intValue.close();
    }
}
