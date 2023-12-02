public class PrintingValues {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        System.out.printf("Display %d and %d", n1, n2);
        System.out.println();
        boolean b1 = true;
        boolean b2 = false;
        System.out.printf("Display bool %b and %b", b1, b2);
        System.out.println();
        String str = "Hello";
        System.out.format("%s world", str);
    }
}