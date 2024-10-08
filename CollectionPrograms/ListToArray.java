package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Def");
        lst.add("Cde");
        lst.add("Abc");
        lst.add("Bcd");
        String[] arr = lst.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = new String[lst.size()];
        arr2 = lst.toArray(arr2);
        for(String s : arr2){
            System.out.println(s);
        }
    }
}
