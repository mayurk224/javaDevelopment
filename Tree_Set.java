import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

    // TreeSet
    // class implements the Set Interface that uss a tree for storage
    // it uses a binary search tree to store its elements in sorted order
    // like HashSet, TreeSet also contains unique elements.
    // However, the access and retrieval time of TreeSet is quite fast.
    // The elements in TreeSet stored in ascending order.

    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();

        s.add("B");
        s.add("C");
        s.add("A");
        s.add("A");
        s.add("a");
        s.add("D");
        s.add("E");

        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    // Comparison between the HashSet and TreeSet

    // TreeSet:
    // Ordering: Maintains elements in a sorted order (natural ordering or by a specified comparator).
    // Performance: Slower than HashSet for basic operations (add, remove, contains) with a time complexity of O(log n).
    // Null Elements: Does not allow null elements.
    // Use Case: Suitable when you need a sorted set of elements.

    // HashSet:
    // Ordering: Does not maintain any order of elements.
    // Performance: Faster than TreeSet for basic operations with a time complexity of O(1).
    // Null Elements: Allows one null element.
    // Use Case: Suitable when you need a fast, unordered set of elements.
    // HashSet is extremely fast performance for adding, contains, removed tasks can be used with any type of objects as its element
}
