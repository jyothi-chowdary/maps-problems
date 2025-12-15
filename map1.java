import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Jyothi");
        students.put(102, "Harsha");
        students.put(103, "Nandhini");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
