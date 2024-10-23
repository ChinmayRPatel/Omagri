package Generics.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class TreeSetOperations {

    public static void main(String[] args) {
        // 1. Creating a TreeSet with natural ordering (Strings will be sorted alphabetically)
        TreeSet<String> treeSet = new TreeSet<>();

        // 2. Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Banana"); // Duplicate element, will not be added
        System.out.println("TreeSet after adding elements: " + treeSet); // Sorted order

        // 3. Checking if an element exists
        boolean containsApple = treeSet.contains("Apple");
        System.out.println("Does TreeSet contain 'Apple'? " + containsApple);

        // 4. Removing an element
        treeSet.remove("Banana");
        System.out.println("TreeSet after removing 'Banana': " + treeSet);

        // 5. Iterating over the TreeSet (for-each loop)
        System.out.println("Iterating over TreeSet using for-each loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // 6. Iterating over the TreeSet (using Iterator)
        System.out.println("Iterating over TreeSet using Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 7. Checking the size of the TreeSet
        int size = treeSet.size();
        System.out.println("Size of the TreeSet: " + size);

        // 8. Getting first and last elements
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // 9. Navigating the set (higher, lower)
        String higherThanMango = treeSet.higher("Mango"); // Returns the next element higher than "Mango"
        String lowerThanMango = treeSet.lower("Mango");   // Returns the previous element lower than "Mango"
        System.out.println("Element higher than 'Mango': " + higherThanMango);
        System.out.println("Element lower than 'Mango': " + lowerThanMango);

        // 10. Clearing all elements from the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing all elements: " + treeSet);

        // 11. Checking if the TreeSet is empty
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty);

        // 12. Creating a TreeSet with a custom Comparator (reverse alphabetical order)
        TreeSet<String> reverseOrderSet = new TreeSet<>(Comparator.reverseOrder());
        reverseOrderSet.add("Apple");
        reverseOrderSet.add("Banana");
        reverseOrderSet.add("Mango");
        reverseOrderSet.add("Orange");
        System.out.println("TreeSet with custom comparator (reverse order): " + reverseOrderSet);
    }
}

