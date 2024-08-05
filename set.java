import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    // Set: are used to store the unordered list of elements which does not
    // allow us to store the duplicate element we can store at most one
    // null value in a set

    // set is implemented by HashSet<E>, LinkedHashSet<E> & TreeSet<E>

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new LinkedHashSet<>();
    }

}
