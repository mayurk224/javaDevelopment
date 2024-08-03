import java.util.ArrayList;

public class comparable_Interface {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(20);

        // Comparing elem of arrayList:
        // compareTo(): this method return int value (+1, 0, -1), this method is from Integer class
        //          - a negative num to indicate a less-than relationship
        //          - 0 to indicate equality
        //          - a positive num to indicate a greater-than relationship

        // Check elem at index 1 is greater, less, or equal to elem at index 2
        // 15 < 20
        System.out.println(list.get(1).compareTo(list.get(2)));
        // 20 = 20
        System.out.println(list.get(2).compareTo(list.get(3)));
        // 20 > 10
        System.out.println(list.get(2).compareTo(list.get(0)));
    }
}
