import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class generic_interface {
    private interface genExample<T>{
        public void PrintMsg(T t);
    }

    public static void main(String[] args) {
        Map<String, List<String>> m = new HashMap<>();
    }
}
