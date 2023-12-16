import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        System.out.println(queue);
        queue.add("Keep");
        queue.add("Sip");
        queue.add("Run");
        queue.add("Ship");
        System.out.println(queue);
        System.out.println("Head : " + queue.element());
        System.out.println("Last : " + queue.peek());
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        // After calling remove(), the element with the next highest priority (according
        // to natural ordering) becomes the front element, and the ordering is
        // maintained.
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
