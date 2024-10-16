package CollectionPrograms.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitsSort {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grape");
        Collections.sort(fruits);
        System.out.println(fruits.toString());
    }
}
