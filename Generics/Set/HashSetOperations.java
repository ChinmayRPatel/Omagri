package Generics.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {

    public static void main(String[] args) {
        // 1. Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // 2. Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Banana"); // Adding duplicate element, will not be added
        System.out.println("HashSet after adding elements: " + hashSet);

        // 3. Checking if an element exists
        boolean containsApple = hashSet.contains("Apple");
        System.out.println("Does HashSet contain 'Apple'? " + containsApple);

        // 4. Removing an element
        hashSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + hashSet);

        // 5. Iterating over the HashSet
        System.out.println("Iterating over HashSet using for-each loop:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // 6. Iterating over HashSet using Iterator
        System.out.println("Iterating over HashSet using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 7. Checking the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of the HashSet: " + size);

        // 8. Clearing all elements from the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing all elements: " + hashSet);

        // 9. Checking if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }
}
