import java.util.Scanner;
/*
 * Control characters (non-printable): 0 to 31
    Printable characters: 32 to 126
    Extended ASCII characters: 127 to 255
 */

public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scanner.nextInt();
        char ch = (char) num;
        System.out.println("ASCII output : " + ch);
        scanner.close();
    }
}
