import java.util.ArrayList;

public class creating_arrayList {
    public static void main(String[] args) {
        // 1. Creating Arraylist of type String
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements to ArrayList
        list.add("hello");
        list.add("how are you");
        list.add("hows going on");

        // 3. Printing List
        System.out.println(list);

        // 4. Adding an element a specific Position
        list.add(2,"Mayur");
        System.out.println(list);
    }
}
