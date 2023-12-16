import java.util.ArrayList;
import java.util.Collections; // Import the Collections class

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    for (int i : myNumbers) {
      System.out.println(i);
    }
    Collections.sort(myNumbers); // Sort myNumbers
    System.out.println("Sorted array");
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}