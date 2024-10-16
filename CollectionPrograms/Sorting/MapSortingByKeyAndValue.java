package CollectionPrograms.Sorting;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortingByKeyAndValue {
    public static void main(String[] args) {

        HashMap<String , Integer> mp = new HashMap<>();
        mp.put("Abc", 1);
        mp.put("Efg", 5);
        mp.put("Def", 4);
        mp.put("Cde", 3);
        mp.put("Bcd", 2);

//        HashSet<Fruits>
//      ******  This is Sorting by key*****

////        Creating the list of keyset
//        ArrayList<String> keyarrbyKey = new ArrayList<>(mp.keySet());
//
////        Sort by collections sort method in for sort the key set
//        Collections.sort(keyarrbyKey);
//        System.out.println("Sorted By key is :- ");
//
////        from key set we get the value as well
//        for(String s:keyarrbyKey){
//            System.out.println("Key = " + s +" Value = "+ mp.get(s));
//        }


//      ******  This is Sorting by Value *****
//        Sort By Value by using  Stream API

        HashMap<String, Integer> temp = mp.entrySet()
                                        .stream()
                                        .sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
                                        .collect(Collectors
                                                .toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)->e1 , LinkedHashMap::new ));

        for (Map.Entry<String, Integer> entry :
                temp.entrySet()) {
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
        }
//** Sort By Values in Stream API ********

        System.out.println("After sorted By Value");
        LinkedHashMap<String, Integer> sortedLinkedHashMap
                = mp.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedLinkedHashMap);

    }
}
