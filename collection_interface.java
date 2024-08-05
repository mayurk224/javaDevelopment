import java.util.ArrayList;
import java.util.Collection;

public class collection_interface {

    // Collection Interface:
    // the interface collection defines the core functionality that
    // we expect of any collection other than a map. it provides
    // methods in four groups.

    // All methods of Collection<E> with four Group
    // 1. Add Elements
    // .add(o:E) - boolean
    // .addAll(c:Collection<?extends E>) - boolean

    // 2. Remove Elements
    // .remove(o:Object) - boolean
    // .clear() - void
    // .removeAll(c:Collection<?>) - boolean
    // . retainAll(c:Collection<?>) - boolean

    // 3. Query the content of collection
    // .contains(o:Object) - boolean
    // .containsAll(c:Collection<?>) - boolean
    // .isEmpty() - boolean
    // .size() - int

    // 4. Making a collection contents available for further processing
    // .iterator() - Iterator<E> (Iterator over element)
    // .toArray() - Object[]
    // <T>.toArray(T[]a) - T[]

    //                -----*******------

    public static void main(String[] args) {

        Collection<String> col = new ArrayList<>();
        col.add("Mayur");
        col.add("Dilip");
        col.add("Kamble");

        // .toString will return an Array with its elements
        System.out.println(col.toString());
    }
}
