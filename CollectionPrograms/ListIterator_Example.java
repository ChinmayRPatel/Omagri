package CollectionPrograms;
// Java Program to traverse the list both in forward and
// backward direction using listIterator

import java.util.*;

public class ListIterator_Example {

    public static void main(String[] args)
    {
        try{
                // list of names
            List<String> names = new LinkedList<>();
            names.add("learn");
            names.add("from");
            names.add("Geeksforgeeks");

            // Getting ListIterator
            ListIterator<String> listIterator;
            listIterator= names.listIterator();

            // Traversing elements
            System.out.println("Forward Direction Iteration:");
            while (listIterator.hasNext()) {
                String fruit = listIterator.next();
    //            System.out.println(listIterator.next());
                if (fruit.equals("learn")) {
                    listIterator.set("Earn");  // Replace Banana with Blueberry
                }
                if(fruit.contains("from")){
                    listIterator.remove();
                }

            }

            // Traversing elements, the iterator is at the end
            // at this point
            System.out.println("Backward Direction Iteration:");
            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }
        }
        catch (Exception e){
        System.out.println(e.getMessage());
    }

}
}
