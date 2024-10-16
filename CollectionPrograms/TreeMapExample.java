package CollectionPrograms;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Basic Operations
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(1, "One");
        treeMap.put(5, "Five");
        System.out.println(treeMap.descendingMap());
        // Printing TreeMap (Natural Sorting of Keys)
        System.out.println("TreeMap: " + treeMap); // Output: {1=One, 2=Two, 3=Three, 4=Four, 5=Five}

        // Get First and Last Key
        System.out.println("First Key: " + treeMap.firstKey()); // Output: 1
        System.out.println("Last Key: " + treeMap.lastKey()); // Output: 5

        // Get SubMap, HeadMap, and TailMap
        System.out.println("SubMap (1, 4): " + treeMap.subMap(2, 4)); // Output: {1=One, 2=Two, 3=Three}
        System.out.println("HeadMap (4): " + treeMap.headMap(4));     // Output: {1=One, 2=Two, 3=Three}
        System.out.println("TailMap (3): " + treeMap.tailMap(3));     // Output: {3=Three, 4=Four, 5=Five}

        // Navigation Methods
        System.out.println("Lower Key (4): " + treeMap.lowerKey(4));   // Output: 3
        System.out.println("Floor Key (4): " + treeMap.floorKey(4));   // Output: 4
        System.out.println("Ceiling Key (4): " + treeMap.ceilingKey(4)); // Output: 4
        System.out.println("Higher Key (4): " + treeMap.higherKey(4)); // Output: 5

        // Polling Entries
        System.out.println("Poll First Entry: " + treeMap.pollFirstEntry()); // Output: 1=One
        System.out.println("Poll Last Entry: " + treeMap.pollLastEntry());   // Output: 5=Five

        // Entry Set and Descending Map
        System.out.println("Entry Set: " + treeMap.entrySet()); // Output: [2=Two, 3=Three, 4=Four]
        System.out.println("Descending Map: " + treeMap.descendingMap()); // Output: {4=Four, 3=Three, 2=Two}

    }
}
