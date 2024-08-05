import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_Set {

    // *LinkedHashSet
    // - The linked hashset is an ordered version of hashset that maintains
    // a doubly linked list across all elems.
    // - When the iteration order is necessary to be maintained, this class
    // is used.
    // - When iterating through a hashset, the order is unpredictable,
    // while a linked hashset lets us iterate through the elements in
    // the order in which they were inserted

    public static void main(String[] args) {

        Set<String> s = new LinkedHashSet<>();
        s.add("A");
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");

        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
