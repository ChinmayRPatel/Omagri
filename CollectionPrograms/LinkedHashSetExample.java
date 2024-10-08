package CollectionPrograms;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        try
        {

            LinkedHashSet<String> fruits = new LinkedHashSet<>();

            // Adding elements to the LinkedHashSet
            fruits.add("Apple");
            fruits.add("Date");
            fruits.add("Banana");
            fruits.add("Cherry");

            // Adding a duplicate element (this will not be added)
            fruits.add("Apple");

            // Printing LinkedHashSet (insertion order maintained)
            System.out.println("LinkedHashSet: " + fruits);

            // Removing an element
            fruits.remove("Date");
            System.out.println("After removing Date: " + fruits);

            // Iterating over LinkedHashSet
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
        catch (Exception e){
        System.out.println(e.getMessage());
    }

}
}
