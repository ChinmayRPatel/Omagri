package Generics.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericMapExample {

    public static void main(String[] args) {
        // 1. Creating a Generic HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // 2. Adding key-value pairs to the Map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);
        map.put("Orange", 40);
        System.out.println("Initial Map: " + map);

        // 3. Accessing a value using a key
        Integer value = map.get("Apple");
        System.out.println("Value associated with 'Apple': " + value);

        // 4. Removing a key-value pair
        map.remove("Banana");
        System.out.println("Map after removing 'Banana': " + map);

        // 5. Checking if a key exists
        boolean hasMango = map.containsKey("Mango");
        System.out.println("Does the map contain 'Mango'? " + hasMango);

        // 6. Checking if a value exists
        boolean hasValue30 = map.containsValue(30);
        System.out.println("Does the map contain the value 30? " + hasValue30);

        // 7. Iterating over keys
        System.out.println("Iterating over keys:");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        // 8. Iterating over values
        System.out.println("Iterating over values:");
        for (Integer val : map.values()) {
            System.out.println("Value: " + val);
        }

        // 9. Iterating over key-value pairs using entrySet()
        System.out.println("Iterating over key-value pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 10. Getting the size of the Map
        int size = map.size();
        System.out.println("Size of the Map: " + size);

        // 11. Clearing the map
        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}

