import java.util.ArrayList;
import java.util.Iterator;

public class iterate_arrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Elem 1");
        list.add("Elem 2");
        list.add("Elem 3");
        list.add("Elem 4");
        list.add("Elem 5");

        // Iteration over arraylist

        // 1. using for loop:
        for(int i= 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // 2. using for-each loop:
        for(String s : list){
            System.out.println(s);
        }

        // 3. using Iterator interface:
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

}
