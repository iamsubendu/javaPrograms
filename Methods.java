public class Methods {
    public static void main(String[] args) {
        Twenty cat = new Twenty();
        cat.setName("Zebra");
        System.out.println(cat.getName());
        cat.updateCount();

        Twenty dog = new Twenty();
        dog.setName("Lion");
        System.out.println(dog.getName());
        dog.updateCount();
    }
}
