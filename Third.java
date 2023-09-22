/**
 * Create basic program to declare variables num1, num2 and result of type
 * float.
 * Perform following operation
 * Addition, Subtraction, Division, Multiplication
 */
public class Third {
    public static void main(String[] arg) {
        float num1 = 8, num2 = 9, result;
        result = num1 + num2;
        System.out.println("Addition Result => " + result);
        result = num1 - num2;
        System.out.println("Subtraction Result => " + result);
        result = num1 * num2;
        System.out.println("Multiplication Result => " + result);
        result = num1 / num2;
        System.out.println("Division Result => " + result);
    }
}