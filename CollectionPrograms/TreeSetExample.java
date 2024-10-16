package CollectionPrograms;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        try{
                // Creating a TreeSet of integers
            TreeSet<Integer> numbers = new TreeSet<>();

            // Adding elements to the TreeSet
            numbers.add(5);
            numbers.add(1);
            numbers.add(3);
            numbers.add(9);
            numbers.add(7);

            // Duplicate elements are ignored
            numbers.add(3);

            // Elements are sorted in natural ascending order
            System.out.println("TreeSet: " + numbers);  // Output: [1, 3, 5, 7, 9]

            // Retrieve first and last elements
            System.out.println("First Element: " + numbers.first()); // Output: 1
            System.out.println("Last Element: " + numbers.last());   // Output: 9

            // Retrieve elements greater than a given value
            System.out.println("Element higher than 5: " + numbers.higher(5));  // Output: 7
            System.out.println("Element lower than 5: " + numbers.lower(5));    // Output: 3

            // Remove an element
            numbers.remove(7);
            System.out.println("After Removing 7: " + numbers);  // Output: [1, 3, 5, 9]
    }
        catch (Exception e){
        System.out.println(e.getMessage());
    }

}
}
