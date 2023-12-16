import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        System.out.println("List1 : " + list1 + "\nList2 : " + list2);

        list1.add(10);
        list1.add(20);
        System.out.println("List1 : " + list1);
        list1.add(0, 30);
        System.out.println("List1 : " + list1);

        list2.add(40);
        list2.addAll(list1);
        System.out.println("List2 : " + list2);

        list2.set(1, 101);
        System.out.println("List2 : " + list2);

        list2.remove(0);
        System.out.println("List2 : " + list2);

        System.out.println("Element at 2 is " + list2.get(2));

    }
}
