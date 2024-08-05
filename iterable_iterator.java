import java.util.ArrayList;
import java.util.Iterator;

public class iterable_iterator {
    // Iterator
    // an iterator is an object that implements the interface iterator:

     // public Iterator<E>{
     // boolean hasNext(); // return true if the iteration has more elements
     // E next(); // return the next element in the iteration
     // void remove(); // remove the last element returned by the iterator
     // }

    // The purpose of iterators is to provide a uniform way of accessing
    // collection elements sequentially so whatever kind of collection
    // you are dealing with, and however it is implemented, you always know
    // how to process its elements in turn.


    // Iterable
    // THis code will work with anything that implements the interface
    // Iterable that is anything that can produce an iterator.
    // This is the declaration of iterable:

    // public Iterable<T>{
    // Iterator<T> iterator(); // return an iterator over elements of type T
    // }


    // Where to use Iterator and Iterable
    // the for-each statement, which you met in previous videos.
    // Using for_each, we can write the preceding code more concisely:

    // for(Object o: coll){
    // sout(o);
    // }

    // in java 5 the Collection interface was made to extend Iterable,
    // so any set, list, or que can be the target of foreach, as can array.

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Mayur");
        list.add("Dilip");
        list.add("Kamble");

        // accessing elem in arraylist using iterator
        // to access using iterator, you should use while loop
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
//            String obj = itr.next();
//            System.out.println(obj);
            System.out.println(itr.next());
        }

        // accessing elem in arraylist using for_each loop
        // for_each loop can be used in all collections
        for(String s : list){
            System.out.println(s);
        }
    }
}
