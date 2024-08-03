import java.util.ArrayList;

public class wrapper_class {
    public static void main(String[] args) {

        // creating an arraylist of type string and adding elem to it
        ArrayList<String> list = new ArrayList<>();

        list.add("Elem 1");
        list.add("Elem 2");
        list.add("Elem 3");
        list.add("Elem 4");
        list.add("Elem 5");

        // creating an arraylist by wrapper class of type integer and adding elem to it
        ArrayList<Integer> list1 = new ArrayList<>();

        // Wrapper class: a class the "Wraps" (Stores) primitive data as an
        // object

        //  in the previous version, this line can be written like this
        //   Integer x = new Integer(15); this is means by wrapping value inside Integer
        int x = 15;

        // in the previous version, this the below line can be written like this
        // Integer y = y.intValue(); this means opening wrapper to get value
        int y = x;

        list1.add(x);
        list1.add(y);

        System.out.println(list1);
    }
}
