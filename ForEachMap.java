import java.util.HashMap;
import java.util.Map;

public class ForEachMap {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Using forEach with Lambda
        studentMap.forEach((id, name) -> 
            System.out.println("Student ID: " + id + ", Name: " + name)
        );
    }
}
