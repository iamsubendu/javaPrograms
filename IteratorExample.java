import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Using an iterator to iterate over the elements
        Iterator<Integer> iterator = numbers.iterator();

        // Using hasNext() and next() methods
        System.out.print("Iterating using Iterator: ");
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.print(number + " ");
        }

        System.out.println(); // Move to the next line

        // You can also use the enhanced for loop (foreach loop) for iteration
        System.out.print("Iterating using foreach loop: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
