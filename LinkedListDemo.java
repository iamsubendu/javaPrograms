import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        /*
         * The <> is a diamond operator introduced in Java 7, and it is used for type
         * inference. In this case, it means that the compiler should infer the type of
         * elements based on the type provided on the left side of the assignment (or
         * the expected type if it's part of a method argument).
         */
        System.out.println("List " + list);
        // System.out.println(list.getFirst());
        System.out.println(list.peek());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List " + list);
        list.add(2, 4);
        System.out.println("List " + list);
        /*
         * The existing element at index 2 is 3.
         * The new element 4 is inserted at index 2, pushing the existing element and
         * subsequent elements to the right.
         * After the insertion, the linked list contains [1, 2, 4, 3, 4].
         */
        list.add(2, 7);
        System.out.println("List " + list);

        System.out.println(list.offer(7));

        System.out.println("Polled element " + list.poll());
        /*
         * get element at head
         */
    }
}
