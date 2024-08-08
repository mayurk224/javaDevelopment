import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {

    // A TreeMap in Java is a part of the java.util package and implements
    // the NavigableMap interface, which extends the SortedMap interface.
    // Here are some key points about the TreeMap:

    // Characteristics:
    // Sorted Order: TreeMap stores its elements in a sorted order based on
    // the natural ordering of its keys or a custom comparator provided at
    // map creation time.
    // Red-Black Tree: Internally, TreeMap is implemented using a Red-Black
    // tree, which is a type of self-balancing binary search tree. This
    // ensures that the map operations have a time complexity of O(log n).

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
    // Null Keys: TreeMap does not allow null keys. Attempting to insert a
    // null key will result in a NullPointerException.
    // Thread Safety: TreeMap is not synchronized. If multiple threads
    // access a TreeMap concurrently, and at least one of the threads
    // modifies the map structurally, it must be synchronized externally.

    // TreeMap is particularly useful when you need a map that maintains
    // a sorted order of its keys, making it ideal for scenarios where you
    // need to perform range-based operations or retrieve elements in a
    // specific order

    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Jan", 1);
        treeMap.put("Feb", 2);
        treeMap.put("Mar", 3);
        treeMap.put("Apr", 4);
        treeMap.put("May", 5);

        System.out.println(treeMap.hashCode());

        for (String name : treeMap.keySet()){
            Integer num = treeMap.get(name);
            System.out.println(name+" : "+num);
        }
    }
}
