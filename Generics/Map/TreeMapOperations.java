package Generics.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapOperations {

    public static void main(String[] args) {
        // 1. Creating a TreeMap with natural ordering of keys (String keys, Integer values)
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // 2. Adding key-value pairs to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Mango", 30);
        treeMap.put("Orange", 40);
        System.out.println("Initial TreeMap: " + treeMap);

        // 3. Accessing a value using a key
        Integer value = treeMap.get("Apple");
        System.out.println("Value associated with 'Apple': " + value);

        // 4. Removing a key-value pair
        treeMap.remove("Banana");
        System.out.println("TreeMap after removing 'Banana': " + treeMap);

        // 5. Checking if a key exists
        boolean hasMango = treeMap.containsKey("Mango");
        System.out.println("Does the TreeMap contain 'Mango'? " + hasMango);

        // 6. Checking if a value exists
        boolean hasValue30 = treeMap.containsValue(30);
        System.out.println("Does the TreeMap contain the value 30? " + hasValue30);

        // 7. Iterating over keys
        System.out.println("Iterating over keys:");
        Set<String> keys = treeMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        // 8. Iterating over values
        System.out.println("Iterating over values:");
        for (Integer val : treeMap.values()) {
            System.out.println("Value: " + val);
        }

        // 9. Iterating over key-value pairs using entrySet()
        System.out.println("Iterating over key-value pairs:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 10. Getting the size of the TreeMap
        int size = treeMap.size();
        System.out.println("Size of the TreeMap: " + size);

        // 11. Getting the first and last keys
        String firstKey = treeMap.firstKey();
        String lastKey = treeMap.lastKey();
        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);

        // 12. Using higherKey and lowerKey
        String higherThanMango = treeMap.higherKey("Mango");
        String lowerThanMango = treeMap.lowerKey("Mango");
        System.out.println("Key higher than 'Mango': " + higherThanMango);
        System.out.println("Key lower than 'Mango': " + lowerThanMango);

        // 13. Using subMap (keys from 'Apple' to 'Orange', inclusive of 'Apple', exclusive of 'Orange')
        Map<String, Integer> subMap = treeMap.subMap("Apple", "Orange");
        System.out.println("SubMap from 'Apple' to 'Orange': " + subMap);

        // 14. Getting a descending order view of the TreeMap
        Map<String, Integer> descendingMap = treeMap.descendingMap();
        System.out.println("TreeMap in descending order: " + descendingMap);

        // 15. Clearing the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap);

        // 16. Checking if the map is empty
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("Is TreeMap empty? " + isEmpty);
    }
}

