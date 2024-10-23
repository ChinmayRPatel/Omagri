package Generics;

// A Generic Class with type parameter T
class Box<T> {
    // Private member variable of type T
    private T item;

    // Constructor that accepts an item of type T
    public Box(T item) {
        this.item = item;
    }

    // Getter method to return the item
    public T getItem() {
        return item;
    }

    // Setter method to update the item
    public void setItem(T item) {
        this.item = item;
    }

    // Method to display the class of the item
    public void displayType() {
        System.out.println("Type of T is: " + item.getClass().getName());
    }
}

// A Generic Class with multiple type parameters (T, U)
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public void displayPair() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

public class GenericClassExample {

    public static void main(String[] args) {
        // 1. Creating a Generic Box for Integer type
        Box<Integer> intBox = new Box<>(10);
        System.out.println("Initial value in intBox: " + intBox.getItem());
        intBox.setItem(20);
        System.out.println("Updated value in intBox: " + intBox.getItem());
        intBox.displayType();

        // 2. Creating a Generic Box for String type
        Box<String> stringBox = new Box<>("Hello Generics");
        System.out.println("Value in stringBox: " + stringBox.getItem());
        stringBox.displayType();

        // 3. Creating a Generic Pair with two different types (String and Integer)
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("Pair: " + pair.getFirst() + " = " + pair.getSecond());
        pair.setSecond(30);  // Updating the second element
        pair.displayPair();

        // 4. Creating a Generic Pair with two different types (Integer and Double)
        Pair<Integer, Double> numberPair = new Pair<>(1, 99.99);
        System.out.println("Number Pair: " + numberPair.getFirst() + " = " + numberPair.getSecond());

        // 5. Wildcards in Generics (Using unbounded wildcard)
        Box<?> wildcardBox = new Box<>("Wildcard String");
        Box<?> wildcardBox1 = new Box<>(12.34);
        System.out.println("Wildcard Box item: " + wildcardBox.getItem());
        System.out.println("Wildcard Box item21: " + wildcardBox1.getItem());
        wildcardBox.displayType();
        wildcardBox1.displayType();

        // 6. Using Upper Bounded Wildcard
        displayUpperBoundedBox(new Box<>(100));  // Works with Integer
        displayUpperBoundedBox(new Box<>(99.9));  // Works with Double
        // displayUpperBoundedBox(new Box<>("String")); // Compile-time error

        // 7. Using Lower Bounded Wildcard
        Box<Number> numberBox = new Box<>(50);
        displayLowerBoundedBox(numberBox);  // Works with Number
        displayLowerBoundedBox(new Box<>(40.5));  // Works with Double (subclass of Number)
        // displayLowerBoundedBox(new Box<>(true)); // Compile-time error
    }

    // A generic method with upper bounded wildcard (accepts Box of Number or its subclasses)
    public static void displayUpperBoundedBox(Box<? extends Number> box) {
        System.out.println("Upper Bounded Box value: " + box.getItem());
    }

    // A generic method with lower bounded wildcard (accepts Box of Number or its superclasses)
    public static void displayLowerBoundedBox(Box<? super Integer> box) {
        System.out.println("Lower Bounded Box value: " + box.getItem());
    }
}
