import java.util.HashMap;
import java.util.Map;

public class Map_interface {

    // What is the Map?
    // In the collection framework, a map contains values on the basis of
    // the key and value pair. This pair is known as an entry

    // Map Features:
    // * Map contains unique Keys
    // * Map allows duplicate values.
    // * Map is useful to search, update or delete elements on the basis of a Key.
    // * Map is the root interface in the Map hierarchy for Collection Framework.
    // * Map interface is extended by SortedMap and implemented by HashMap, LinkedHashMap.
    // * Map implementation classes HashMap and LinkedHashMap allow null keys and value, but TreeMap doesn't allow null key and value.
    // * Map can't be transversed for traversing needs to convert into the Set using method keySet() or entrySet().

    //                      ------*******-------

    // The Map interface in Java is a part of the java.util package and
    // represents a collection that maps keys to values. Here are some
    // key points about the Map interface:

    // Basic Characteristics:
    // A map cannot contain duplicate keys; each key can map to at most one
    // value.
    // Maps are useful for storing data in key-value pairs, making it easy
    // to retrieve, update, or delete elements based on their keys.

    // Common Implementations:
    // HashMap: This implementation does not maintain any order of the keys.
    // LinkedHashMap: Maintains the insertion order of keys.
    // TreeMap: Maintains keys in a sorted (ascending) order.

    // Key Methods:
    // put(K key, V value): Inserts a key-value pair into the map.
    // get(Object key): Retrieves the value associated with the specified key.
    // remove(Object key): Removes the key-value pair for the specified key.
    // containsKey(Object key): Checks if the map contains the specified key.
    // containsValue(Object value): Checks if the map contains the specified value.
    // keySet(): Returns a set of all the keys in the map.
    // values(): Returns a collection of all the values in the map.
    // entrySet(): Returns a set of all the key-value pairs in the map.

    // Special Considerations:
    // HashMap and LinkedHashMap allow null keys and values, while TreeMap
    // does not.
    // The order of elements in a HashMap is not guaranteed, whereas
    // LinkedHashMap maintains insertion order and TreeMap maintains a
    // sorted order.

    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap<>();
        // the order using HashMap is according to hash code,
        // so the order can be change
        m.put("Jan",1);
        m.put("Feb",2);
        m.put("Mar",3);
        m.put("Apr",4);
        m.put("May",5);

        System.out.println(m.get("May"));
        System.out.println(m.containsKey("Apr"));
        System.out.println(m.containsValue(3));
        System.out.println(m.keySet());
        System.out.println(m.isEmpty());
        System.out.println(m.entrySet());
        System.out.println(m.values());
    }
}
