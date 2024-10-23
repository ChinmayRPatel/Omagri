package Generics.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetOperations {

    public static void main(String[] args) {
        // 1. Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // 2. Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");  // Adding duplicate element, will not be added
        System.out.println("LinkedHashSet after adding elements: " + linkedHashSet);

        // 3. Checking if an element exists
        boolean containsApple = linkedHashSet.contains("Apple");
        System.out.println("Does LinkedHashSet contain 'Apple'? " + containsApple);

        // 4. Removing an element
        linkedHashSet.remove("Banana");
        System.out.println("LinkedHashSet after removing 'Banana': " + linkedHashSet);

        // 5. Iterating over the LinkedHashSet (for-each loop)
        System.out.println("Iterating over LinkedHashSet using for-each loop:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // 6. Iterating over the LinkedHashSet (using Iterator)
        System.out.println("Iterating over LinkedHashSet using Iterator:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 7. Checking the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of the LinkedHashSet: " + size);

        // 8. Clearing all elements from the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing all elements: " + linkedHashSet);

        // 9. Checking if the LinkedHashSet is empty
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty? " + isEmpty);
    }
}

