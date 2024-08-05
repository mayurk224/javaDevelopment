import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {

        // HashSet: used a hash table for storage that places element into
        // specific position based upon integers called hash code
        Set<String> s = new HashSet<>();
        s.add("Mayur");
        s.add("Mayur");
        s.add("Dilip");
        s.add("Kamble");

        Iterator<String> itr = s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // The output will include each unique element exactly once.
        // The order of elements is not guaranteed because HashSet does
        // not maintain any order. However, all unique elements will be
        // printed

        //              -------******--------

        // When to use HashSet?
        //You should use HashSet when:
        //You need a collection of unique elements.
        //You require fast lookup, addition, and deletion operations.
        //The order of elements is not important.
        //You need to perform set operations like union, intersection, or difference.

        // Example 1: Eliminating Duplicates
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplicate entry will be ignored

        for (String name : names) {
            System.out.println(name);
        }


        // Example 2: Fast Lookup (a checking element is present in a list or not)
        Set<Integer> ids = new HashSet<>();
        ids.add(1001);
        ids.add(1002);
        ids.add(1003);

        if (ids.contains(1002)) {
            System.out.println("ID 1002 exists in the set.");
        }


        // Example 3: Set of operations (Union, Intersection, Difference)
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        Set<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");

        // Union (Adding elem from set2 to set1)
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection (checking same elem in set1 & set2)
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // remove the non_common element and return the common element
        System.out.println("Intersection: " + intersection);

        // Difference (checking the different elem from set1 & set2)
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2); // remove the common elem and return the non_common elem
        System.out.println("Difference: " + difference);
    }
}
