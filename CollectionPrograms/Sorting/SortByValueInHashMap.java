package CollectionPrograms.Sorting;

import java.util.*;
import java.util.stream.Collectors;

public class SortByValueInHashMap {

    // function to sort hashmap by values
    public static LinkedHashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        LinkedHashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Abcd", 1);
        hm.put("Bcd", 2);
        hm.put("Def", 3);
        hm.put("Dfg", 4);
        hm.put("Fgk", 5);

        System.out.println(hm);
        hm.forEach((k, v)-> System.out.println(" "+ k + " , "+ v));



        //***************/        cOMPARING WITH VALUES ********************//
//        LinkedHashMap<String, Integer> sortedLHM = new LinkedHashMap<>();
//        sortedLHM = sortByValue(hm);
//
//
//        System.out.println("After sort By Values");
//        sortedLHM.forEach((k, v)-> System.out.println(" "+ k + " , "+ v));




//        ******* Sort using the cllections comparator of collection ****
        List<Map.Entry<String, Integer> > list
                = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));



        //  ********** sORT bY KEY THEN USE BELOW
//        Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> temp : list){
            sortedMap.put(temp.getKey(), temp.getValue());
        }
//        SOrt By Value in hashmap
        System.out.println(sortedMap);



//        ******Sort By Value Using Stream API *********
        LinkedHashMap<String, Integer> sortedLinkedHashMap
                = hm.entrySet()
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
