import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Orange");

        System.out.println(map);
    }
}
