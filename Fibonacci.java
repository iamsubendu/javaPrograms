//0,1,1,2,3,5,8,13,21,43,...

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        System.out.print(a + ",");
        int b = 1;
        System.out.print(b + ",");
        int c = 0;
        for (int i = 0; i < 11; i++) {
            if (i == 10) {
                System.out.print(a + b + ",...");
            } else {
                System.out.print(a + b + ",");
            }
            c = a;
            a = b;
            b = c + b;
        }

    }
}