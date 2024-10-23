package Generics.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class LinkedListOperations {

    public static void main(String[] args) {
        // 1. Creating a LinkedList with Generics (String type)
        LinkedList<String> linkedList = new LinkedList<>();

        // 2. Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");
        System.out.println("LinkedList after adding elements: " + linkedList);

        // 3. Adding an element at a specific index
        linkedList.add(1, "Grapes");
        System.out.println("LinkedList after adding Grapes at index 1: " + linkedList);

        // 4. Adding elements at the start and end
        linkedList.addFirst("Pineapple"); // Adds element at the start of the list
        linkedList.addLast("Watermelon"); // Adds element at the end of the list
        System.out.println("LinkedList after adding elements at the start and end: " + linkedList);

        // 5. Accessing elements
        String firstElement = linkedList.getFirst();  // Access the first element
        String lastElement = linkedList.getLast();    // Access the last element
        String elementAtIndex2 = linkedList.get(2);   // Access the element at index 2
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // 6. Updating elements (Setting a new value at a specific index)
        linkedList.set(3, "Peach");
        System.out.println("LinkedList after updating element at index 3: " + linkedList);

        // 7. Removing elements by value
        linkedList.remove("Banana");
        System.out.println("LinkedList after removing Banana: " + linkedList);

        // 8. Removing elements by index
        linkedList.remove(1);  // Removes the element at index 1
        System.out.println("LinkedList after removing element at index 1: " + linkedList);

        // 9. Removing first and last elements
        linkedList.removeFirst(); // Removes the first element
        linkedList.removeLast();  // Removes the last element
        System.out.println("LinkedList after removing first and last elements: " + linkedList);

        // 10. Checking if an element exists
        boolean containsMango = linkedList.contains("Mango");
        System.out.println("Does the list contain Mango? " + containsMango);

        // 11. Finding the index of an element
        int indexOfApple = linkedList.indexOf("Apple");
        System.out.println("Index of Apple: " + indexOfApple);

        // 12. Getting the size of the list
        int size = linkedList.size();
        System.out.println("Size of the list: " + size);

        // 13. Iterating over elements using different methods

        // a) Using a for-each loop
        System.out.println("Iterating using a for-each loop:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // b) Using an Iterator
        System.out.println("Iterating using an Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 14. Sorting the list in ascending order
        Collections.sort(linkedList);
        System.out.println("LinkedList after sorting in ascending order: " + linkedList);

        // 15. Sorting the list in descending order using Comparator
        Collections.sort(linkedList, Comparator.reverseOrder());
        System.out.println("LinkedList after sorting in descending order: " + linkedList);

        // 16. Clearing all elements from the list
        linkedList.clear();
        System.out.println("LinkedList after clearing all elements: " + linkedList);

        // 17. Checking if the list is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
