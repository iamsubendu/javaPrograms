
// break
import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Scanner t = new Scanner(System.in);
        System.out.println("Please enter a number from 1-5");
        int target = t.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at " + i);
                break;
            }
        }
        t.close();
    }
}
