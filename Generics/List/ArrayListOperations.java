package Generics.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListOperations {

    public static void main(String[] args) {
        // 1. Creating an ArrayList with Generics (String type)
        List<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Fruits List after adding elements: " + fruits);

        // 3. Adding an element at a specific index
        fruits.add(1, "Grapes");
        System.out.println("Fruits List after adding Grapes at index 1: " + fruits);

        // 4. Accessing elements
        String fruitAtIndex2 = fruits.get(2);  // Access element at index 2
        System.out.println("Fruit at index 2: " + fruitAtIndex2);

        // 5. Updating elements (Setting a new value at a specific index)
        fruits.set(3, "Peach");
        System.out.println("Fruits List after updating element at index 3: " + fruits);

        // 6. Removing elements by value
        fruits.remove("Banana");
        System.out.println("Fruits List after removing Banana: " + fruits);

        // 7. Removing elements by index
        fruits.remove(1);  // Removes the element at index 1
        System.out.println("Fruits List after removing element at index 1: " + fruits);

        // 8. Checking if an element exists
        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does the list contain Mango? " + containsMango);

        // 9. Finding the index of an element
        int indexOfApple = fruits.indexOf("Apple");
        System.out.println("Index of Apple: " + indexOfApple);

        // 10. Getting the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // 11. Iterating over elements using different methods

        // a) Using a for-each loop
        System.out.println("Iterating using a for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // b) Using an Iterator
        System.out.println("Iterating using an Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 12. Sorting the list in ascending order
        Collections.sort(fruits);
        System.out.println("Fruits List after sorting in ascending order: " + fruits);

        // 13. Sorting the list in descending order using Comparator
        Collections.sort(fruits, Comparator.reverseOrder());
        System.out.println("Fruits List after sorting in descending order: " + fruits);

        // 14. Clearing all elements from the list
        fruits.clear();
        System.out.println("Fruits List after clearing all elements: " + fruits);

        // 15. Checking if the list is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
