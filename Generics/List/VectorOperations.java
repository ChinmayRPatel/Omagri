package Generics.List;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class VectorOperations {

    public static void main(String[] args) {
        // 1. Creating a Vector (of type String)
        Vector<String> vector = new Vector<>();

        // 2. Adding elements to the vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");
        vector.add("Orange");
        System.out.println("Vector after adding elements: " + vector);

        // 3. Adding an element at a specific index
        vector.add(1, "Grapes");
        System.out.println("Vector after adding Grapes at index 1: " + vector);

        // 4. Accessing elements
        String elementAtIndex2 = vector.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // 5. Updating elements (Setting a new value at a specific index)
        vector.set(3, "Peach");
        System.out.println("Vector after updating element at index 3: " + vector);

        // 6. Removing elements by value
        vector.remove("Banana");
        System.out.println("Vector after removing Banana: " + vector);

        // 7. Removing elements by index
        vector.remove(1);  // Removes the element at index 1
        System.out.println("Vector after removing element at index 1: " + vector);

        // 8. Checking if an element exists
        boolean containsMango = vector.contains("Mango");
        System.out.println("Does the vector contain Mango? " + containsMango);

        // 9. Finding the index of an element
        int indexOfApple = vector.indexOf("Apple");
        System.out.println("Index of Apple: " + indexOfApple);

        // 10. Getting the size of the vector
        int size = vector.size();
        System.out.println("Size of the vector: " + size);

        // 11. Iterating over elements using different methods

        // a) Using a for-each loop
        System.out.println("Iterating using a for-each loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // b) Using an Iterator
        System.out.println("Iterating using an Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 12. Sorting the vector in ascending order
        Collections.sort(vector);
        System.out.println("Vector after sorting in ascending order: " + vector);

        // 13. Sorting the vector in descending order using Comparator
        Collections.sort(vector, Comparator.reverseOrder());
        System.out.println("Vector after sorting in descending order: " + vector);

        // 14. Clearing all elements from the vector
        vector.clear();
        System.out.println("Vector after clearing all elements: " + vector);

        // 15. Checking if the vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Is the vector empty? " + isEmpty);
    }
}
