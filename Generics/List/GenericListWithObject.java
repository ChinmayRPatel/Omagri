package Generics.List;

import java.util.ArrayList;
import java.util.List;

public class GenericListWithObject {
    public static void main(String[] args) {

        // Creating a List that can hold any type of object
        List<Object> list = new ArrayList<>();

        // Adding different types of objects to the list
        list.add("Hello");          // String
        list.add(123);              // Integer
        list.add(45.67);            // Double
        list.add(true);             // Boolean

        // Retrieving elements from the list
        for (Object obj : list) {
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println("String value: " + str);
            } else if (obj instanceof Integer) {
                Integer integer = (Integer) obj;
                System.out.println("Integer value: " + integer);
            } else if (obj instanceof Double) {
                Double dbl = (Double) obj;
                System.out.println("Double value: " + dbl);
            } else if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                System.out.println("Boolean value: " + bool);
            }
        }
    }
}

