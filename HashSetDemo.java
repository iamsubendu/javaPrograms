import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        System.out.println(hashSet);
        hashSet.add("R");
        hashSet.add("L");
        System.out.println(hashSet);
        // duplicate won't get included
        hashSet.add("L");
        hashSet.add("Z");
        System.out.println(hashSet);

        Iterator<String> itr = hashSet.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
    }
}
