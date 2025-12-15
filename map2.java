import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String s = "java is easy java is powerful";
        String[] words = s.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
