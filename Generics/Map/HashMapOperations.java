package Generics.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {

    public static void main(String[] args) {
        // 1. Creating a HashMap with String keys and Integer values
        Map<String, Integer> hashMap = new HashMap<>();

        // 2. Adding key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Mango", 30);
        hashMap.put("Orange", 40);
        System.out.println("Initial HashMap: " + hashMap);

        // 3. Accessing a value using a key
        Integer value = hashMap.get("Apple");
        System.out.println("Value associated with 'Apple': " + value);

        // 4. Removing a key-value pair
        hashMap.remove("Banana");
        System.out.println("HashMap after removing 'Banana': " + hashMap);

        // 5. Checking if a key exists
        boolean hasMango = hashMap.containsKey("Mango");
        System.out.println("Does the HashMap contain 'Mango'? " + hasMango);

        // 6. Checking if a value exists
        boolean hasValue30 = hashMap.containsValue(30);
        System.out.println("Does the HashMap contain the value 30? " + hasValue30);

        // 7. Iterating over keys
        System.out.println("Iterating over keys:");
        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        // 8. Iterating over values
        System.out.println("Iterating over values:");
        for (Integer val : hashMap.values()) {
            System.out.println("Value: " + val);
        }

        // 9. Iterating over key-value pairs using entrySet()
        System.out.println("Iterating over key-value pairs:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 10. Getting the size of the HashMap
        int size = hashMap.size();
        System.out.println("Size of the HashMap: " + size);

        // 11. Using putIfAbsent (adds only if the key is absent)
        hashMap.putIfAbsent("Grapes", 50);
        System.out.println("HashMap after putIfAbsent('Grapes', 50): " + hashMap);

        // 12. Using replace (replaces value if the key exists)
        hashMap.replace("Apple", 100);
        System.out.println("HashMap after replacing value for 'Apple': " + hashMap);

        // 13. Using compute (computes a new value for the key)
        hashMap.compute("Orange", (key, val) -> val * 2);
        System.out.println("HashMap after compute for 'Orange': " + hashMap);

        // 14. Using merge (merges a new value with the existing value)
        hashMap.merge("Mango", 10, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("HashMap after merging value for 'Mango': " + hashMap);

        // 15. Clearing the map
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);

        // 16. Checking if the map is empty
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);
    }
}

