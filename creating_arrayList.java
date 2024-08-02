import java.util.ArrayList;

public class creating_arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("how are you");
        list.add("hows going on");

        System.out.println(list);

        list.add(2,"Mayur");
        System.out.println(list);
    }
}
