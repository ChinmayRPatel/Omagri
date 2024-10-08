package CollectionPrograms;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkedList_example {
    public static void main(String[] args) {
        try{

            LinkedList<String> list = new LinkedList<>();

            // Adding elements to LinkedList
            list.add("Apple");
            list.add("Banana");
            list.add("Orange");
            list.addFirst("Mango");  // Adds Mango at the start of the list
            list.addLast("Grapes");  // Adds Grapes at the end of the list

            System.out.println("LinkedList: " + list);
            // Accessing elements using get() method
            System.out.println("First Element: " + list.get(0));  // Access by index

            // Accessing first and last elements
            System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());

            // Removing elements from LinkedList
            list.remove("Banana");  // Removes "Banana"
            list.removeFirst();      // Removes the first element (Apple)
            list.removeLast();       // Removes the last element (Orange)

            System.out.println("LinkedList after removal: " + list);
            var iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println("******");

            Queue<String> queue = new LinkedList<>();

            // Adding elements to the queue
            queue.add("Customer 1");
            queue.add("Customer 2");
            queue.add("Customer 3");


            // Removing the first element
            System.out.println("Serving: " + queue.poll());  // FIFO: Removes "Customer 1"

            // Peek at the next customer
            System.out.println("Next customer: " + queue.peek());
            queue.add("AA");
            queue.add("BB");
            queue.add("CC");
            queue.remove();//this will delete the index number 0 which is top of the queue
            System.out.println(queue.toString());


            System.out.println("******Stack below****");
            Stack<String> stack = new Stack<>();
            stack.push("X");
            stack.add("Y");
            stack.add("A");
            stack.add("B");
            stack.pop();    // this will remove the last lement of the stack
            System.out.println(stack.toString());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

