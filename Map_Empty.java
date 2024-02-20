import java.util.HashMap;
import java.util.Map;

public class Map_Empty {
    public static void main(String[] args) {
        // Create an empty HashMap
        Map<String, Integer> myMap = new HashMap<>();

        // Check if the HashMap is empty
        if (myMap.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // Add some key-value mappings
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);

        // Check again after adding mappings
        if (myMap.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }
    }
}
