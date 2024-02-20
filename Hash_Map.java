import java.util.HashMap;
import java.util.Map;

public class Hash_Map{
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Associate values with keys
        studentScores.put("John", 85);
        studentScores.put("Alice", 92);
        studentScores.put("Bob", 78);

        // Display the HashMap
        System.out.println("Student Scores:");
        displayHashMap(studentScores);

        // Add more values
        studentScores.put("Eva", 95);
        studentScores.put("Mark", 89);

        // Display the updated HashMap
        System.out.println("\nUpdated Student Scores:");
        displayHashMap(studentScores);
    }

    private static void displayHashMap(Map<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
}
