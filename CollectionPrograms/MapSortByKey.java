package CollectionPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortByKey {
    public static void main(String[] args) {
//        Map<String , Integer> mp = new HashMap<>();
        Map<String , Integer> mp = Map.of("Abc", 1,
                                        "Xyz", 4,
                                        "Pqr", 5,
                                        "Asads", 2);
        System.out.println("Before sorting "+ mp.toString());
        Map<String, Integer> sortedmp = new TreeMap<>(mp);
        System.out.println(sortedmp.toString());
    }
}
