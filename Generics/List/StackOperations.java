package Generics.List;
import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        // 1. Creating a Stack (of type String)
        Stack<String> stack = new Stack<>();

        // 2. Pushing elements (adding to the stack)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Orange");
        System.out.println("Stack after pushing elements: " + stack);

        // 3. Accessing the top element (peek)
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // 4. Popping elements (removing the top element)
        String removedElement = stack.pop();
        System.out.println("Popped element: " + removedElement);
        System.out.println("Stack after popping: " + stack);

        // 5. Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // 6. Searching for an element (returns position from top)
        int positionOfMango = stack.search("Mango");
        System.out.println("Position of Mango in stack: " + positionOfMango);

        // 7. Checking the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);

        // 8. Iterating over elements using for-each loop
        System.out.println("Iterating through the stack elements:");
        for (String element : stack) {
            System.out.println(element);
        }

        // 9. Clearing the stack
        stack.clear();
        System.out.println("Stack after clearing all elements: " + stack);

        // 10. Checking if the stack is empty again
        isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}

