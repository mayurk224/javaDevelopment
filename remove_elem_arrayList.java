import java.util.ArrayList;

public class remove_elem_arrayList {
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

        // 5. Change an element in arraylist
        list.set(0,"Changed");
        System.out.println(list);

        //6. Remove an element by index from arraylist
        list.remove(1);
        System.out.println(list);

        // 7. Remove an element by object from arraylist
        list.remove("Mayur");
        System.out.println(list);
    }
}
