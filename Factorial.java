import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner numberOfIteration = new Scanner(System.in);
        System.out.println("Enter a number for you want factorial of");
        int number = numberOfIteration.nextInt();
        int factRes = 1;
        int prevRes = 1;
        for (int i = number; i >= 1; i--) {
            int currentVal = i;
            factRes = currentVal * prevRes;
            prevRes = factRes;
        }
        System.out.println("Factorial of given number " + number + " is : " + factRes);
        numberOfIteration.close();
    }
}
