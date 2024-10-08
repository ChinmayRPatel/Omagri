package CollectionPrograms;
import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a new Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding elements using put()
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        // Retrieving a value using get()
        System.out.println("Value for key 1: " + hashtable.get(1)); // Output: One

        // Checking if a key or value exists
        System.out.println("Contains key 2? " + hashtable.containsKey(2)); // Output: true
        System.out.println("Contains value 'Two'? " + hashtable.containsValue("Two")); // Output: true

        // Removing an element
        hashtable.remove(1);
        System.out.println("After removing key 1: " + hashtable); // Output: {2=Two, 3=Three}

        // Checking the size
        System.out.println("Size of hashtable: " + hashtable.size()); // Output: 2

        // Iterating over the elements
        System.out.println("Iterating over entries:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using keySet() to get all keys
        System.out.println("Keys in hashtable: " + hashtable.keySet());

        // Using values() to get all values
        System.out.println("Values in hashtable: " + hashtable.values());

        // Checking if the hashtable is empty
        System.out.println("Is hashtable empty? " + hashtable.isEmpty()); // Output: false

        // Cloning the hashtable
        Hashtable<Integer, String> clonedTable = (Hashtable<Integer, String>) hashtable.clone();
        System.out.println("Cloned hashtable: " + clonedTable);

        // Clearing the hashtable
        hashtable.clear();
        System.out.println("After clearing, size of hashtable: " + hashtable.size()); // Output: 0
    }
}
