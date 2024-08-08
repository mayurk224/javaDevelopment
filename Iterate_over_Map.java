import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iterate_over_Map {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        // the order using HashMap is according to hash code,
        // so the order can be change
        m.put("Jan",1);
        m.put("Feb",2);
        m.put("Mar",3);
        m.put("Apr",4);
        m.put("May",5);

        // .value() returns all values & .keySet() returns all key
        // map does not have iterator method

        // iterate over keyset in map
//        Set<String> name = m.keySet();
//        for (String s : name){
//            System.out.println("Month : "+s);
//        }

        // iterate over values in map
//        Collection<Integer> num = m.values();
//        for (Integer i : num){
//            System.out.println("Num : "+i);
//        }

        // iterate over a key value pair in a map
        // this is easies and short way to iterate over a key value pair in a map
        for (String name : m.keySet()){
            Integer num = m.get(name);
            System.out.println(name+" : "+num);
        }

        // advance way to iterate over the key value pair in a map
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
