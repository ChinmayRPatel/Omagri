package Generics.Map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapOperations {

    public static void main(String[] args) {
        // 1. Creating a LinkedHashMap with String keys and Integer values
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // 2. Adding key-value pairs to the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Mango", 30);
        linkedHashMap.put("Orange", 40);
        System.out.println("Initial LinkedHashMap: " + linkedHashMap);

        // 3. Accessing a value using a key
        Integer value = linkedHashMap.get("Apple");
        System.out.println("Value associated with 'Apple': " + value);

        // 4. Removing a key-value pair
        linkedHashMap.remove("Banana");
        System.out.println("LinkedHashMap after removing 'Banana': " + linkedHashMap);

        // 5. Checking if a key exists
        boolean hasMango = linkedHashMap.containsKey("Mango");
        System.out.println("Does the LinkedHashMap contain 'Mango'? " + hasMango);

        // 6. Checking if a value exists
        boolean hasValue30 = linkedHashMap.containsValue(30);
        System.out.println("Does the LinkedHashMap contain the value 30? " + hasValue30);

        // 7. Iterating over keys
        System.out.println("Iterating over keys:");
        Set<String> keys = linkedHashMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        // 8. Iterating over values
        System.out.println("Iterating over values:");
        for (Integer val : linkedHashMap.values()) {
            System.out.println("Value: " + val);
        }

        // 9. Iterating over key-value pairs using entrySet()
        System.out.println("Iterating over key-value pairs:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 10. Getting the size of the LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Size of the LinkedHashMap: " + size);

        // 11. Using putIfAbsent (adds only if the key is absent)
        linkedHashMap.putIfAbsent("Grapes", 50);
        System.out.println("LinkedHashMap after putIfAbsent('Grapes', 50): " + linkedHashMap);

        // 12. Using replace (replaces value if the key exists)
        linkedHashMap.replace("Apple", 100);
        System.out.println("LinkedHashMap after replacing value for 'Apple': " + linkedHashMap);

        // 13. Using compute (computes a new value for the key)
        linkedHashMap.compute("Orange", (key, val) -> val * 2);
        System.out.println("LinkedHashMap after compute for 'Orange': " + linkedHashMap);

        // 14. Using merge (merges a new value with the existing value)
        linkedHashMap.merge("Mango", 10, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("LinkedHashMap after merging value for 'Mango': " + linkedHashMap);

        // 15. Clearing the map
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedHashMap);

        // 16. Checking if the map is empty
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("Is LinkedHashMap empty? " + isEmpty);
    }
}

